def parse_test_name(test_name):
    """
    Parses the test name to extract the numeric part (e.g., '1501' from 'test1501' or 'RegressionTest3.test1501').
    """
    if '.' in test_name:
        # Split at the dot and take the second part (e.g., 'test1501')
        return test_name.split(".")[1]
    else:
        # If there is no dot, assume it's already in the form 'test1501' and extract the numeric part
        return test_name.replace("test", "")

def read_similarity_scores(file_path):
    """
    Reads the similarity scores from a given file and returns a dictionary of test methods
    with their respective similarity scores.
    """
    test_scores = {}
    
    with open(file_path, 'r') as file:
        lines = file.readlines()
        for line in lines:
            # Example line format: "Similarity score between RegressionTest.<init> and RegressionTest3.test1501: 2.5/10"
            parts = line.strip().split(":")
            if len(parts) == 2:
                score_info = parts[1].strip()
                try:
                    # Attempt to parse the score as a float
                    score = float(score_info.split("/")[0])  # Get the part before the slash
                except ValueError:
                    print(f"Warning: Unable to convert score '{score_info}' to a float.")
                    score = 0  # Default to 0 in case of error
                
                test_pair = parts[0].strip().replace("Similarity score between ", "")
                test1, test2 = test_pair.split(" and ")
                
                # Parse test names to get the numeric parts (e.g., '1501' from 'RegressionTest3.test1501')
                test1 = parse_test_name(test1)
                test2 = parse_test_name(test2)
                
                # Store the similarity score for the test pair
                test_scores[(test1, test2)] = score

    print(f"Read {len(test_scores)} test pairs from {file_path}")
    return test_scores

def write_to_files(test_scores):
    """
    Writes the test pairs into high, medium, and low possibility redundant files
    based on their similarity scores.
    """
    high_file = "high_possibility_redundant.txt"
    medium_file = "medium_possibility_redundant.txt"
    low_file = "low_possibility_redundant.txt"

    # Open files for writing
    with open(high_file, 'w') as high, open(medium_file, 'w') as medium, open(low_file, 'w') as low:
        for (test1, test2), score in test_scores.items():
            avg_score = score
            print(f"Writing: {test1} and {test2} with score {avg_score}")  # Debug print
            # Format the output as "test1 and test2 : Score: score"
            if avg_score >= 8:
                high.write(f"{test1} and {test2} : Score: {avg_score}\n")
            elif 5 <= avg_score < 8:
                medium.write(f"{test1} and {test2} : Score: {avg_score}\n")
            else:
                low.write(f"{test1} and {test2} : Score: {avg_score}\n")

    print("Files have been written successfully!")

def main():
    # Paths to the input files
    txt_file_path = 'methodReport.txt'  # Path to the TXT report file
    xml_file_path = 'coverageReport.txt'  # Path to the XML report file

    # Step 1: Read the similarity scores from both files
    print("Reading similarity scores from the TXT file...")
    txt_scores = read_similarity_scores(txt_file_path)
    print("Reading similarity scores from the XML file...")
    xml_scores = read_similarity_scores(xml_file_path)

    # Step 2: Merge the scores from both files
    combined_scores = {}
    print("Combining scores from both files...")
    for key in txt_scores:
        if key in xml_scores:
            # Calculate the average of the two similarity scores
            avg_score = (txt_scores[key] + xml_scores[key]) / 2
            combined_scores[key] = avg_score
            print(f"Test pair {key}: {txt_scores[key]} (TXT), {xml_scores[key]} (XML), avg: {avg_score}")
        else:
            print(f"Test pair {key} not found in XML scores.")

    print(f"Combined scores for {len(combined_scores)} test pairs.")

    # Step 3: Write the results to appropriate files based on the similarity score
    write_to_files(combined_scores)

if __name__ == "__main__":
    main()
