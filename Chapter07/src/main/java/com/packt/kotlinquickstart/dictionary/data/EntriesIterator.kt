package com.packt.kotlinquickstart.dictionary.data

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.core.JsonToken
import com.fasterxml.jackson.databind.MappingJsonFactory

class EntriesIterator : Iterator<DictionaryEntry> {

    private val jsonParser: JsonParser = MappingJsonFactory()
            .createParser(javaClass.classLoader.getResourceAsStream("dictionary.json"))
    private var currentToken: JsonToken?

    init {
        currentToken = jsonParser.currentToken
        while (currentToken != JsonToken.FIELD_NAME) {
            currentToken = jsonParser.nextToken()
        }
    }

    override fun hasNext(): Boolean {
        return currentToken != JsonToken.END_OBJECT
    }

    override fun next(): DictionaryEntry {
        var term = ""
        var definition = ""
        if (currentToken == JsonToken.FIELD_NAME) {
            term = jsonParser.valueAsString
            currentToken = jsonParser.nextToken()
        }

        if (currentToken == JsonToken.VALUE_STRING) {
            definition = jsonParser.valueAsString
            currentToken = jsonParser.nextToken()
        }

        if (currentToken == JsonToken.END_OBJECT) {
            jsonParser.close()
        }

        return DictionaryEntry(term, definition)
    }
}