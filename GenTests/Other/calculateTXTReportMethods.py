import re

def read_extracted_methods(file_path):
    """
    Reads the extracted methods from the file and returns a dictionary of method counts
    and parameters for each test. The dictionary format is {test_name: {method_name: {'count': count, 'params': parameters}}}.
    """
    print("Reading extracted methods from file...")
    
    test_method_data = {}  # This will store method counts and parameters for each test

    with open(file_path, 'r') as file:
        lines = file.readlines()
        current_test = None
        for line in lines:
            if line.startswith('Method:'):
                parts = line.strip().split(", Parameters: ")
                method_name = parts[0].replace("Method: ", "").strip()
                parameters = eval(parts[1].strip())  # Convert string to tuple/list
                
                # Check if we are still processing the same test method
                if method_name.startswith('test'):  # This is the start of a new test
                    current_test = method_name
                    test_method_data[current_test] = {}

                # Initialize method if not already present for the test
                if current_test and method_name not in test_method_data[current_test]:
                    test_method_data[current_test][method_name] = {'count': 0, 'params': parameters}
                
                # Increment the counter for the method
                if current_test and method_name in test_method_data[current_test]:
                    test_method_data[current_test][method_name]['count'] += 1

    # Debugging output
    print(f"Test Method Data: {test_method_data}")
    return test_method_data


def compare_method_parameters(params1, params2):
    """
    Compare two parameter lists for similarity.
    The similarity score is the number of matching parameters (ignoring order).
    """
    if not params1 or not params2:
        return 0  # If either has no parameters, return 0 similarity

    # Convert parameters to sets for easier comparison
    set1 = set(params1)
    set2 = set(params2)

    # Find common parameters
    common_params = set1.intersection(set2)

    # Similarity score based on number of common parameters
    similarity_score = len(common_params) / max(len(set1), len(set2))
    
    return similarity_score


def calculate_similarity_score(test_method_data, test1, test2):
    """
    Compare two tests' method counts and calculate a similarity score (1-10).
    Incorporates parameter similarity.
    """
    if test1 not in test_method_data or test2 not in test_method_data:
        return 0  # One of the tests doesn't exist

    # Get the methods data for both tests
    test1_methods = test_method_data[test1]
    test2_methods = test_method_data[test2]

    total_diff = 0
    total_param_similarity = 0
    total_methods = 0

    # Compare the methods of both tests
    for method1, data1 in test1_methods.items():
        if method1 in test2_methods:
            data2 = test2_methods[method1]

            # Compare the parameter similarity for this method
            param_similarity = compare_method_parameters(data1['params'], data2['params'])

            # Add parameter similarity to the total score
            total_param_similarity += param_similarity

            # Calculate the method count difference and add it to total_diff
            method_diff = abs(data1['count'] - data2['count'])
            total_diff += method_diff

            total_methods += 1

    if total_methods == 0:
        return 0  # No common methods found

    # Calculate the average parameter similarity
    avg_param_similarity = total_param_similarity / total_methods

    # Combine method count similarity and parameter similarity
    total_similarity = (10 - total_diff) + (avg_param_similarity * 5)  # Weighted sum

    # Ensure the score is between 1 and 10
    similarity_score = max(1, min(total_similarity, 10))

    return round(similarity_score, 2)


def compare_tests_and_write_scores(test_method_data, output_file):
    """
    Compare all tests and write the similarity scores to an output file.
    """
    with open(output_file, 'w') as outfile:
        for test1 in test_method_data:
            for test2 in test_method_data:
                if test1 != test2:  # Don't compare a test with itself
                    similarity_score = calculate_similarity_score(test_method_data, test1, test2)
                    outfile.write(f"Similarity score between {test1} and {test2}: {similarity_score}/10\n")


if __name__ == "__main__":
    input_file = 'extracted_methods.txt'  # Path to the extracted methods file
    output_file = 'methodReport.txt'  # Path to output file for similarity scores

    # Step 1: Read methods data from the extracted file
    test_method_data = read_extracted_methods(input_file)
    
    # Step 2: Compare tests and write similarity scores to the output file
    compare_tests_and_write_scores(test_method_data, output_file)
    
    print(f"Similarity scores have been written to {output_file}")
