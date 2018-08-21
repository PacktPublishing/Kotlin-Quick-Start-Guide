package quickstart.kotlin.chapter6

import java.math.BigInteger

class Length(val value: Double) {
    operator fun plus(other: Length): Length {
        return Length(this.value + other.value)
    }

    operator fun plus(double: Double): Length {
        return Length(this.value + double)
    }

    operator fun plus(str: String): String {
        return "$value $str"
    }
}

fun sumLengths() {
    val l1 = Length(12.0)
    val l2 = Length(23.5)

    val sum = l1 + l2

    val l3 = Length(10.0)
    val sum1 = l3 + 12.0

    val str: String = l1 + "kilometers"

    val javaL1 = JavaLength(12.0)
    val javaL2 = JavaLength(7.5)

    val javaSum = javaL1 + javaL2

    val s = BigInteger.ONE + BigInteger.TEN
}


fun bitShifting() {
    val n = 8 shr 1
}