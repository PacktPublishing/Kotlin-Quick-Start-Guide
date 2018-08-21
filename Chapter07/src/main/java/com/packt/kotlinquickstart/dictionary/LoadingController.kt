package com.packt.kotlinquickstart.dictionary

import com.packt.kotlinquickstart.dictionary.data.DictionaryLoader
import com.packt.kotlinquickstart.dictionary.data.EntriesIterator
import javafx.application.Platform
import javafx.fxml.FXML
import javafx.scene.control.Alert
import javafx.scene.control.ScrollPane
import javafx.scene.control.TextArea

class LoadingController {

    private val loader = DictionaryLoader(EntriesIterator())

    @FXML
    fun initialize() {
        loader.loadDictionary()
                .thenRunAsync(Runnable { MainApp.instance.onDictionaryLoaded() }
                        , MainThreadExecutor.INSTANCE)
                .handle { _, fail -> if (fail != null) Platform.runLater { onError(fail) } }
    }

    private fun onError(fail: Throwable) {
        val alert = Alert(Alert.AlertType.ERROR)
        alert.headerText = "An error occurred!"
        alert.dialogPane.expandableContent = ScrollPane(TextArea(fail.message))
        alert.showAndWait()
    }
}