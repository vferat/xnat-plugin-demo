import os

HOME = os.path.expanduser("~")
XNAT_PATH = os.path.join(HOME, 'xnat-docker-compose') # Edit
PROJECT_PATH = os.path.dirname(os.path.abspath(__file__))

# Build plugin
build_cmd = "CI=true ./gradlew clean xnatDataBuilder xnatPluginJar"
os.system(build_cmd)

# find plugin
libs_path = os.path.join(PROJECT_PATH, 'build', 'libs')
for file in os.listdir(libs_path):
    if file.endswith("-xpl.jar"):
        jar_path = os.path.join(libs_path, file)
        jar_name = file
# Copy to xnat
to_path = os.path.join(XNAT_PATH, "xnat", "plugins", jar_name)
cp_cmd = f"sudo cp {jar_path} {to_path}"
os.system(cp_cmd)

# Restart XNAT
os.chdir(XNAT_PATH)
os.system(f"sudo docker-compose down")
os.system(f"sudo docker-compose up -d")