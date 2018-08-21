    package quickstart.kotlin.extensions

fun Int.isPowerOf2(): Boolean {
    return this > 0 && ((this and this - 1) == 0)
}

fun callExtension() {
    val n = 8
    val isPowerOf2 = n.isPowerOf2()
}