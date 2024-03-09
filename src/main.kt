fun getExercisesEfficiency():List<List<Double>> {
    return getCsvFloatContent("exercises_efficiency.csv")
}

fun main() {
    val coeffs = getFileFloatLines("coeffs.txt")
    val trainedMusclesPerExo = getExercisesEfficiency().toMutableList()
    val exercises = getFileLines("exercices.txt")
    println(exercises)
}