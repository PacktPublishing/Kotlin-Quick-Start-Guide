private fun sayMyName(name: String) {
    println(name)
}

fun accessPrivateFunc() {
    sayMyName("John")
}