package quickstart.kotlin.chapter6

import kotlin.concurrent.thread
import kotlin.jvm.Volatile

fun startAThread() {
    thread {
        //something long running
        println("Work done")
    }
}

@Synchronized
fun threadSafeFunction() {

}

class SynchronizedClass {
    fun synchronizedBlock() {
        // multiple threads can be here
        synchronized(this) {
            //only one thread at a time can be here
        }
    }
}


class Volatile {
    @Volatile
    private var counter = 0
}