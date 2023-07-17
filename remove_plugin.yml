    import re

    # Load the pom.xml file
    with open('pom.xml', 'r') as file:
        content = file.read()
    
    # Define the regex pattern to match the plugin section
        pattern = r'<plugin>\s+<groupId>org\.openapitools<\/groupId>\s+<artifactId>openapi-generator-maven-plugin<\/artifactId>[\s\S]+?<\/plugin>'
      
      # Remove the plugin section from the content
        content = re.sub(pattern, '', content)

    # Write the modified content back to the pom.xml file
    with open('pom.xml', 'w') as file:
        file.write(content)
