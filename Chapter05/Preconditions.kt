package quickstartguide.kotlin.chapter5

fun requireMinLength(str: String) {
    require(str.length > 5) { "Minimum length is 5" }
}

fun checkMinLength5(str: String) {
    check(str.length > 5) { "Minimum length is 5" }
}

fun checkNoNulls(str: String?) {
    val strNoNull: String = checkNotNull(str) { "str argument can not be null" }
}

fun requireNoNulls(str: String?) {
    val strNoNulls: String = requireNotNull(str) { "str argument can not be null" }
}

fun throwError() {
    error("Something went wrong")
}