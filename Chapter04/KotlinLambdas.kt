package quickstart.kotlin.chapter4

fun setClickLisener(button: Button) {
    button.setOnClickListener({ v: View -> println("Clicked on: $v") })
    button.setOnClickListener({ (v: View) -> println("Clicked on: $v") })
    button.setOnClickListener { v -> println("Clicked on: $v") }
    button.setOnClickListener({ v ->
        {
            println("Clicked on: $v")
        }
    })
}

fun sum() {
    val sumLambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    //compiler error
    val noReturn: (Int, Int) -> Int = { a: Int, b: Int -> return a + b }

    val multilineSum: (Int, Int) -> Int = { a, b ->
        println("Summing numbers: $a and $b")
        val result = a + b
        println("The result is: $result")
        result
    }
}