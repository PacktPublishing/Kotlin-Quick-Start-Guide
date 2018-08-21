package quickstart.kotlin.chapter6

val Int.isPowerOf2: Boolean
    get() = this > 0 && ((this and this - 1) == 0)

fun callIsPowerOf2() {
    val n = 16
    val isPowerOf2 = n.isPowerOf2
}