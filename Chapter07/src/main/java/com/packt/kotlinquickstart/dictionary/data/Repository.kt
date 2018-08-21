package com.packt.kotlinquickstart.dictionary.data

import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Statement

class Repository(private val dbConnectionProvider: DbConnectionProvider = DbConnectionProvider.defaultProvider) {

    fun onStart() {
        executeStatement { executeUpdate("CREATE VIRTUAL TABLE IF NOT EXISTS entries USING FTS4 (entry, explanation)") }
    }

    fun isDataLoaded(): Boolean {
        return executeStatement {
            val result = executeQuery("SELECT COUNT(*) FROM entries")
            result.next() && result.getInt(1) > 0
        }
    }

    fun search(searchTerm: String, exactMatch: Boolean = true): List<DictionaryEntry> {
        return prepareStatement("SELECT * FROM entries WHERE entry MATCH ?") {
            setString(1, if (exactMatch) searchTerm else "$searchTerm*")
            executeQuery().use { resultSet -> resultSet.getEntries() }
        }
    }

    private inline fun <T> executeStatement(block: Statement.() -> T): T {
        dbConnectionProvider.getConnection().use { conn ->
            conn.createStatement().use { stmt ->
                return stmt.block()
            }
        }
    }

    private inline fun <T> prepareStatement(sql: String, block: PreparedStatement.() -> T): T {
        dbConnectionProvider.getConnection().use { conn ->
            conn.prepareStatement(sql).use { stmt ->
                return stmt.block()
            }
        }
    }
}

private fun ResultSet.getEntries(): List<DictionaryEntry> {
    val entries = ArrayList<DictionaryEntry>()
    while (this.next()) {
        val term = this.getString(1)
        val explanation = this.getString(2)
        entries.add(DictionaryEntry(term, explanation))
    }
    return entries
}