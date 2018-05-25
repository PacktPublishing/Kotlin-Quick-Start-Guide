fun casting(any: Any) {
    val num = any as Int
}

fun safeCasting(any: Any) {
    val num: Int? = any as? Int
}

fun safeCastingWithElvisl(any: Any) {
    val num: Int = any as? Int ?: 0
}