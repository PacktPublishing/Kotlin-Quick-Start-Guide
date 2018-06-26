package quickstart.kotlin.chapter4

val multiplier: (Int, Int) -> Int = { a, b -> a * b }

val print: () -> Unit = { println("Kotlin") }

val print2 = { println("Kotlin") }

val nullableFun: (() -> Unit)? = null

val nullableReturnType: () -> String? = { null }

fun functionArg(func: () -> String) {

}

fun applyLambda(a: Int, b: Int, modifierFunc: (Int, Int) -> Int) {
    val result = modifierFunc(a, b)
    println("Result of applying a function: $result")
}

fun longRunningTask(onFinished: (Any) -> Unit, onError: (Throwable) -> Unit) {
    try {
        //something long running
        onFinished("got result")
    } catch (fail: Throwable) {
        onError(fail)
    }
}

fun longRunningTask2(onFinished: (result: Any) -> Unit, onError: (fail: Throwable) -> Unit) {
    try {
        //something long running
        onFinished("got result")
    } catch (fail: Throwable) {
        onError(fail)
    }
}

fun longRunningTask3(onFinished: (result: Any) -> Unit, onError: (fail: Throwable) -> Unit) {
    try {
        //something long running
        onFinished.invoke("got result")
    } catch (fail: Throwable) {
        onError.invoke(fail)
    }
}

fun callLongRunningTask() {
    longRunningTask2({ result -> println("Result: $result") }, { fail -> println("Error: ${fail.message}") })
}

fun callLongRunningTask2() {
    longRunningTask2({ r -> println("Result: $r") }, { err -> println("Error: ${err.message}") })
}