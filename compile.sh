RED='\033[0;31m'
GREEN='\033[0;32m'
NC='\033[0m'
output="BodyWeightTrainer.jar"

echo "Compiling Kotlin files..."
kotlinc src/*.kt -include-runtime -d $output
if [ $? -ne 0 ]; then
    echo -e "${RED}Compilation failed.${NC}" >&2
    exit 1
fi
echo "Compilation successful."
echo "Running output..."
java -jar $output
echo -e "${GREEN}Execution complete.${NC}"