package quickstartguide.kotlin.chapter5

fun castToInt(strings: List<String>): List<Int> {
    val result = mutableListOf<Int>()
    for (s in strings) {
        val i = s.toIntOrNull()
        if (i != null) {
            result.add(i)
        }
    }
    return result
}

fun callJava() {
    val java = JavaPlatformTypes()
    val strings = listOf("Item added in Kotlin", "Another item added in Kotlin")
    // UnsupportedOperationException thrown here
    java.checkStrings(strings)
}

fun falseImmutable() {
    val list: List<String> = ArrayList()
    val mutableList = (list as ArrayList).add("string")
}

fun main(args: Array<String>) {
    falseImmutable()
}
