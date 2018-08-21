package com.packt.kotlinquickstart.dictionary

import com.packt.kotlinquickstart.dictionary.data.DictionaryEntry
import javafx.fxml.FXML
import javafx.scene.control.ListCell
import javafx.fxml.FXMLLoader
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.scene.text.TextAlignment


class DictionaryEntryCell: ListCell<DictionaryEntry>() {

    @FXML
    private lateinit var termLbl: Label

    @FXML
    private lateinit var explanationLbl: Label

    @FXML
    private lateinit var cellHost: VBox

    init {
        val fxmlLoader = FXMLLoader(javaClass.classLoader.getResource("dictionary_entry_cell.fxml"))
        fxmlLoader.setController(this)
        fxmlLoader.load<DictionaryEntryCell>()
    }

    @FXML
    fun initialize() {
        explanationLbl.isWrapText = true
        explanationLbl.textAlignment = TextAlignment.JUSTIFY
    }

    override fun updateItem(dictionaryEntry: DictionaryEntry?, empty: Boolean) {
        super.updateItem(item, empty)
        if (dictionaryEntry != null && !empty) {
            termLbl.text = dictionaryEntry.term
            explanationLbl.text = dictionaryEntry.explanation
            graphic = cellHost
        } else {
            graphic = null
            text = ""
        }
    }
}