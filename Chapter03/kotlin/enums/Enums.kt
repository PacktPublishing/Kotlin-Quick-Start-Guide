package quickstartguide.kotlin.chapter3.kotlin.enums

enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

val march = Month.MARCH

val may = Month2.MAY
val mayNum = may.num

enum class Month2 (val num: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12)
}

fun iterateMonths() {
    for (month in Month.values()) {
        println(month)
    }
}

val june = Month.valueOf("JUNE")