package com.packt.kotlinquickstart.dictionary

import javafx.application.Platform
import java.util.concurrent.Executor

class MainThreadExecutor private constructor() : Executor {

    override fun execute(command: Runnable) {
        Platform.runLater(command)
    }

    companion object {
        private val instance = MainThreadExecutor()

        val INSTANCE
            get() = instance
    }
}