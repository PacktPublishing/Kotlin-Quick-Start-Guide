package quickstartguide.kotlin.chapter3.kotlin.anonymousobjects

import java.io.Writer


fun runnable() {
    Thread(object : Runnable {
        override fun run() {
            println("I'm created with anonymous object")
        }
    }).run()
}

val runnable = object : Runnable {
    override fun run() {
        println("I'm created with anonymous object")
    }
}

val writer = object : Writer() {

    override fun write(cbuf: CharArray, off: Int, len: Int) {
        // implementation omitted
    }

    override fun flush() {
        // implementation omitted
    }

    override fun close() {
        // implementation omitted
    }
}