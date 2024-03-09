fun getExercisesEfficiency():List<List<Double>> {
    return getCsvFloatContent("exercises_efficiency.csv")
}

fun getCurrentLevel():Int {
    return getIntFileContent("niveau de sport.txt")
}

fun main() {
    val coeffs = getFileFloatLines("coeffs.txt")
    val trainedMusclesPerExo = getExercisesEfficiency().toMutableList()
    val exercises = getFileLines("exercices.txt")
    var result = MutableList(exercises.size) {0}
    result[1] = getCurrentLevel()
    println(result)
}