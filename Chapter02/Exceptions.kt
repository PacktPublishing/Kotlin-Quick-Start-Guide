import java.io.File
import java.io.FileNotFoundException
import java.io.OutputStream

fun tryCatch() {
    val file = File("foo")
    var stream: OutputStream? = null
    try {
        stream = file.outputStream()
        //do something with stream
    } catch (ex: FileNotFoundException) {
        println("File doesn't exist")
    } finally {
        if (stream != null) stream.close()
    }
}

fun throwError(num: Int) {
    if (num !in 1..10) throw IllegalArgumentException("Number has to be from 1 to 10")
}

fun throwExpression(value: Int, divisor: Int) {
    val divide = if (divisor > 0) {
        value / divisor
    } else {
        throw IllegalArgumentException("Can’t divide with 0")
    }
}