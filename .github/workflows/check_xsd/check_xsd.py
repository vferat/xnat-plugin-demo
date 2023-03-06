import os
from lxml import etree


def load_xsd(file_path):
    # Load the XSD file
    try:
        etree.XMLSchema(file=file_path)
        print(f"File: {file_path} : The XSD file is well-formed and has the correct structure.")
    except etree.XMLSchemaParseError as error:
        print(f"File: {file_path} : The XSD file is not well-formed or has the incorrect structure:", error)


root = os.getcwd()
for path, subdirs, files in os.walk(root):
    for file in files:
        if file.endswith(".xsd"):
            filepath = os.path.join(path, file)
            load_xsd(filepath)