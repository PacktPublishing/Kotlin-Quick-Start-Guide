fun ifExpression(num: Int) {
    val bar: String = if (num < 10) "Lower than 10" else "Equal or greater than 10"
}


fun loop() {
    for (i in 0..10) {
        println(i)
    }
}

fun loopTypeSpecified() {
    for (i: Int in 0..10) {
        println(i)
    }
}

fun inKeyword() {
    if (5 in 1..10) print("5 found in range")
}

fun untilLoop() {
    for (i in 1 until 5) {
        println(i)
    }
}

fun downToLoop() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

fun forIterate() {
    val array = arrayOf(1, 2, 3)
    for (i in array) println (i)
}

fun whileLoop() {
    var i = 0
    while (i < 10) {
        println("value is $i")
        i += 1
    }
}

fun doWhile() {
    do {
        println("This will be printed only once")
    } while (false)
}