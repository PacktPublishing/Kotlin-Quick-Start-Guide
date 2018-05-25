fun checkNumbers(num: Int) {
    when(num) {
        1 -> println("Number is 1")
        2,3,4,5 -> println("Number is in range from 2 to 5")
    }
}

fun checkNumbersExhaustive(num: Int): String {
    return when(num) {
        1 -> "Number is 1"
        2,3,4,5 -> "Number is in range from 2 to 5"
        else -> "Number is higher than 5"
    }
}

fun whenAny(any: Any) {
    when (any) {
        is Int -> println("This is an Int type")
        is Double -> println("This is a Double type")
        is String -> println("This is a String type")
    }
}

fun whenWithoutArgument(a: Int, b: Int) {
    when {
        a * b > 100 -> println("product of a and b is more than 100")
        a + b > 100 -> println("sum of a and b is more than 100")
        a < b -> println("a is less than b")
    }
}