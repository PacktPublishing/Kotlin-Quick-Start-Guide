var error: String = null //Compiler error

var nullable: String? = null


fun nullCheck(str: String?) {
    val upperCase: String? = if (str != null) {
        str.toUpperCase()
    } else {
        null
    }
}

fun safeCall(str: String?) {
    val upperCase: String? = str?.toUpperCase()
}


fun safeCallChaining(str: String?) {
    val firstLetterCapitalized: String? = str?.take(1)?.toUpperCase()
}

fun nonNullAssertion(str: String?) {
    val nonNullString = str!!
    val upperCase: String = nonNullString.toUpperCase()
    println(upperCase)
}

fun elvisOperator(str: String?) {
    val upperCase = str?.toUpperCase() ?: ""
}

fun chainingElvisOperator(first: String?, second:String?) {
    val upperCase = first?.toUpperCase() ?: second?.toUpperCase() ?: ""
}