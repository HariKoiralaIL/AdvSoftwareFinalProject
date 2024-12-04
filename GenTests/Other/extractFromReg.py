import re
import os

# Function to clean type casts like (int), (byte), etc., from parameters
def clean_parameter(param):
    """Removes type casting and other unwanted characters from parameters."""
    param = re.sub(r'\([^)]*\)', '', param)  # Removes type casts like (int), (byte)
    return param.strip()

# Function to clean assertion parameters
def clean_assertion(param):
    """Cleans assertions with string concatenations and splits them into variable and expected value."""
    # Remove concatenation and extra quotes
    param = re.sub(r'\s*\+\s*', '', param)  # Removes + within strings
    param = re.sub(r'\+\s*', '', param)
    param = param.replace('"', '').strip()

    # Handle assertions like int3 == 5200 or int3 != 5200
    if '==' in param:
        parts = param.split('==')
        return [part.strip() for part in parts]
    elif '!=' in param:
        parts = param.split('!=')
        return [part.strip() for part in parts]
    else:
        return [param.strip()]  # For rare cases with no comparison operator

# Function to extract method calls and their parameters from Java test code
def extract_methods_and_parameters(test_code):
    """Extracts method calls and parameters from a Java test code string."""
    method_pattern = re.compile(r'(\w+)\((.*?)\)')  # Matches method calls like multiply(100, 50)

    matches = method_pattern.findall(test_code)
    methods_and_params = []

    for method, params in matches:
        if method.startswith('assert'):
            # Clean and process assertion parameters
            params_list = clean_assertion(params)
        else:
            # Split and clean non-assertion parameters
            params_list = [clean_parameter(param) for param in params.split(',') if param.strip()]

        methods_and_params.append((method, params_list))
    
    return methods_and_params

# Function to append extracted methods and parameters to a file
def append_to_file(file_path, methods_and_params):
    """Appends extracted method calls and parameters to a file."""
    with open(file_path, 'a') as file:  # Open in append mode
        for method, params in methods_and_params:
            file.write(f"Method: {method}, Parameters: {params}\n")

# Function to extract from multiple Java test files and append to a single output file
def extract_and_append_from_files(input_file_paths, output_file_path):
    """Extracts method calls and parameters from multiple Java test files and appends them to an output file."""
    for input_file_path in input_file_paths:
        if os.path.exists(input_file_path):  # Check if the file exists
            with open(input_file_path, 'r') as file:
                test_code = file.read()

            # Extract method calls and parameters
            methods_and_params = extract_methods_and_parameters(test_code)

            # Append the extracted data to the output file
            append_to_file(output_file_path, methods_and_params)
        else:
            print(f"Warning: {input_file_path} does not exist.")

# Example usage
if __name__ == "__main__":
    # Specify the list of input files and the output file path
    input_files = ['RegressionTest0.java', 'RegressionTest1.java', 'RegressionTest2.java', 'RegressionTest3.java']  # List your input files here
    output_file_path = 'extracted_methods.txt'  # This will be your output file

    # Extract method calls and parameters from multiple Java files and append to the output file
    extract_and_append_from_files(input_files, output_file_path)
