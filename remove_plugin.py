import xml.etree.ElementTree as ET

# Parse the pom.xml file
tree = ET.parse('pom.xml')
root = tree.getroot()

# Find the plugin element to remove
plugin_element = root.find(".//plugin[groupId='org.openapitools' and artifactId='openapi-generator-maven-plugin']")

# Remove the plugin element if found
if plugin_element is not None:
    root.remove(plugin_element)

# Save the modified XML back to the file
tree.write('pom.xml')
