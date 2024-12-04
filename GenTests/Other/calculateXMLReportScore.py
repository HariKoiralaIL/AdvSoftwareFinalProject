import xml.etree.ElementTree as ET

def read_coverage_from_xml(xml_path):
    print("Reading coverage data from XML...")
    tree = ET.parse(xml_path)
    root = tree.getroot()
    coverage_data = {}
    
    # Parse the XML for coverage data
    for class_element in root.findall('class'):
        for method_element in class_element.findall('method'):
            method_name = method_element.get('name')
            method_coverage = {'line': 0.0, 'branch': 0.0, 'complexity': 0.0, 'instruction': 0.0}
            for counter in method_element.findall('counter'):
                counter_type = counter.get('type')
                if counter_type == 'LINE':
                    method_coverage['line'] = float(counter.get('covered', 0))
                elif counter_type == 'BRANCH':
                    method_coverage['branch'] = float(counter.get('covered', 0))
                elif counter_type == 'COMPLEXITY':
                    method_coverage['complexity'] = float(counter.get('covered', 0))
                elif counter_type == 'INSTRUCTION':
                    method_coverage['instruction'] = float(counter.get('covered', 0))
            # Use just the method name for the key
            coverage_data[method_name] = method_coverage
    
    print(f"Read coverage for {len(coverage_data)} methods.")
    return coverage_data

def calculate_similarity_score(coverage1, coverage2):
    # Calculate similarity for each metric
    line_similarity = 1 - abs(coverage1['line'] - coverage2['line']) / max(coverage1['line'], coverage2['line'], 1)
    branch_similarity = 1 - abs(coverage1['branch'] - coverage2['branch']) / max(coverage1['branch'], coverage2['branch'], 1)
    complexity_similarity = 1 - abs(coverage1['complexity'] - coverage2['complexity']) / max(coverage1['complexity'], coverage2['complexity'], 1)
    instruction_similarity = 1 - abs(coverage1['instruction'] - coverage2['instruction']) / max(coverage1['instruction'], coverage2['instruction'], 1)
    
    # Average similarity
    avg_similarity = (line_similarity + branch_similarity + complexity_similarity + instruction_similarity) / 4
    score = avg_similarity * 10  # Scale to 1-10 range
    
    # Ensure score is between 1 and 10
    score = max(1, min(10, score))
    
    return round(score, 2)

def compare_methods_and_save_to_file(coverage_data, output_file):
    with open(output_file, 'w') as file:
        # Iterate through all the methods and compare each method to every other method
        for method1, coverage1 in coverage_data.items():
            for method2, coverage2 in coverage_data.items():
                # Skip comparisons where methods are the same or both methods are '<init>'
                if method1 == method2 or '<init>' in [method1, method2]:
                    continue
                
                similarity_score = calculate_similarity_score(coverage1, coverage2)
                # Write the formatted similarity score to the output file
                file.write(f"Similarity score between {method1} and {method2}: {similarity_score}/10\n")

def main():
    xml_file = 'filtered_report.xml'  # Example XML file path
    output_file = 'coverageReport.txt'  # Output file to save the results
    
    coverage_data = read_coverage_from_xml(xml_file)
    compare_methods_and_save_to_file(coverage_data, output_file)

if __name__ == "__main__":
    main()
