package quickstart.kotlin.chapter4

fun returnStatement() {
    val nums = arrayOf(1, 2, 3, 4, 5)
    println("Started iterating the array")
    nums.forEach { n ->
        if (n > 2) {
            return
        }
    }
    println("Finished iterating the array")
}

fun returnStatement2() {
    val nums = arrayOf(1, 2, 3, 4, 5)
    println("Started iterating the array")
    nums.forEach { n ->
        if (n > 2) {
            return@forEach
        }
    }
    println("Finished iterating the array")
}

fun returnStatement3() {
    val lamdba = label@ {
        return@label
    }
}