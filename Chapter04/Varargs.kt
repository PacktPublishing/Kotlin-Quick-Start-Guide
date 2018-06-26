package quickstart.kotlin.chapter4

fun sumNumbers(vararg num: Int): Int {
    var result = 0
    for (i in num) {
        result += i
    }
    return result
}

fun callVarargs() {
    val result = sumNumbers(1, 2, 3, 4, 5)
}

fun spreadOperator() {
    val nums = intArrayOf(1, 2, 3, 4, 5)
    val result = sumNumbers(*nums)
}