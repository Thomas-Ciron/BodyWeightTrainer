import java.io.File

fun getFileFloatLines(filePath:String):List<Double> {
    return getFileLines(filePath).map { it.toDouble() }
}

fun getFileLines(filePath:String):List<String> {
    return File("data/" + filePath).readLines()
}

fun getCsvContent(filePath:String):List<List<String>> {
    return getFileLines(filePath).map { it.split(";")}
}

fun getCsvFloatContent(filePath:String):List<List<Double>> {
    return getCsvContent(filePath).map { row ->
        row.map { it.toDoubleOrNull() ?: 0.0}
    }
}

fun getFileContent(filePath:String):String {
    return File("data/" + filePath).readText()
}

fun getIntFileContent(filePath:String):Int {
    return getFileContent(filePath).toInt()
}