package quickstartguide.kotlin.chapter5

import java.util.*

fun stringBldrApply() {
    var stringBuilder = StringBuilder().apply {
        appendln("I'm the first line of the String Builder")
    }
}

fun letStringBuilder() {

    val str: String = StringBuilder().let { sb ->
        sb.appendln("First Line")
        sb.appendln("Second Line")
        sb.appendln("Third Line")
        sb.toString()
    }
}

fun withStringBuilder() {
    val stringBuilder = StringBuilder()
    with(stringBuilder) {
        appendln("First Line")
        appendln("Second Line")
        appendln("Third Line")
    }

    val str: String = with(StringBuilder()) {
        appendln("First Line")
        appendln("Second Line")
        appendln("Third Line")
        toString()
    }
}

fun useFunc() {
    val inputStream = "Kotlin".byteInputStream()
    inputStream.use { stream ->
        val scanner = Scanner(stream)
        if (scanner.hasNext()) scanner.next() else ""
    }
}

fun useFuncThrows() {
    val inputStream = "Kotlin".byteInputStream()
    inputStream.use { stream ->
        error("Reading streams is not supported")
    }
}

val s by lazy {  }

fun lazyVar() {
    val str = lazy { "" }
}