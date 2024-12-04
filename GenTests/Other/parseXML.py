import xml.etree.ElementTree as ET

def parse_coverage_report(xml_file):
    tree = ET.parse(xml_file)
    root = tree.getroot()

    # Create a new root for the filtered XML to save only relevant parts
    new_root = ET.Element("report", name="Filtered JaCoCo Coverage Report")
    
    # Print out the root tag and its children to help with debugging
    print(f"Root tag: {root.tag}")
    
    # Iterate through all 'class' elements and filter by the test class names
    for _class in root.iter('class'):
        class_name = _class.attrib.get('name', '')
        print(f"Checking class: {class_name}")
        
        # Check if the class name starts with 'RegressionTest' (ignoring other conditions)
        if class_name.startswith("RegressionTest"):
            # Create a copy of the class and append it to the new root
            new_class = ET.SubElement(new_root, 'class', name=class_name)
            for element in _class:
                new_class.append(element)
    
    # If no relevant classes were found, print a message
    if len(new_root) == 0:
        print("No relevant classes found.")
    
    # Create a new tree with the filtered root and return it
    new_tree = ET.ElementTree(new_root)
    return new_tree

def save_parsed_xml_to_file(tree, output_file):
    # Save the filtered XML tree to a new file
    tree.write(output_file, encoding='utf-8', xml_declaration=True)

# Example usage
xml_file = 'report.xml'  # Input XML file
output_file = 'filtered_report.xml'  # Output file to save filtered XML

# Parse the XML file
filtered_tree = parse_coverage_report(xml_file)

# Save the filtered XML to a new file
save_parsed_xml_to_file(filtered_tree, output_file)

print(f"Filtered XML has been saved to {output_file}")
