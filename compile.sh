RED='\033[0;31m'
GREEN='\033[0;32m'
NC='\033[0m'

echo "Compiling Kotlin files..."
kotlinc main.kt file.kt -include-runtime -d output.jar
if [ $? -ne 0 ]; then
    echo -e "${RED}Compilation failed.${NC}" >&2
    exit 1
fi
echo "Compilation successful."
echo "Running output..."
java -jar output.jar
echo -e "${GREEN}Execution complete.${NC}"