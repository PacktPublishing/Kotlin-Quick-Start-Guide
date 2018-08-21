package com.packt.kotlinquickstart.dictionary

import com.packt.kotlinquickstart.dictionary.data.Repository
import com.packt.kotlinquickstart.dictionary.data.DictionaryEntry
import javafx.collections.FXCollections
import javafx.event.EventHandler
import javafx.fxml.FXML
import javafx.scene.control.*
import javafx.scene.input.KeyCode
import javafx.scene.layout.Priority
import javafx.scene.layout.VBox
import javafx.util.Callback
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer


class MainController {

    @FXML
    private lateinit var root: VBox

    @FXML
    private lateinit var searchBtn: Button

    @FXML
    private lateinit var searchText: TextArea

    @FXML
    private lateinit var exactMatchCb: CheckBox

    @FXML
    private lateinit var noResultsText: Label

    private var listView: ListView<DictionaryEntry>? = null

    private val repository = Repository()
    private val observableItems = FXCollections.observableArrayList<DictionaryEntry>()

    @FXML
    fun initialize() {
        searchBtn.onMouseClicked = EventHandler {
            onSearchClicked()
        }

        searchText.onKeyPressed = EventHandler { event ->
            if (event.code == KeyCode.ENTER) {
                event.consume()
                onSearchClicked()
            }
        }

        createListView()
    }

    private fun onSearchClicked() {
        noResultsText.isManaged = false
        clearListView()

        val text = searchText.text?.trim()
        if (text != null && text.isNotEmpty()) {
            CompletableFuture.supplyAsync {
                repository.search(text, exactMatchCb.isSelected)
            }.thenAcceptAsync(Consumer { results ->
                if (results.isNotEmpty()) {
                    observableItems.addAll(results)
                } else {
                    noResultsText.isManaged = true
                }
            }, MainThreadExecutor.INSTANCE)
        }
    }

    private fun clearListView() {
        root.children.removeAll(listView)
        observableItems.clear()
        createListView()
    }

    private fun createListView() {
        listView = ListView(observableItems)
        listView?.cellFactory = Callback { DictionaryEntryCell() }
        root.children.add(listView)
        VBox.setVgrow(listView, Priority.ALWAYS)
    }
}