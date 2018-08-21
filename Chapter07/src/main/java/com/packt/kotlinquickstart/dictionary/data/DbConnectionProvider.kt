package com.packt.kotlinquickstart.dictionary.data

import java.sql.Connection
import java.sql.DriverManager

interface DbConnectionProvider {
    fun getConnection(): Connection

    companion object {
        val defaultProvider: DbConnectionProvider = LocalDbConnectionProvider()
    }
}

private class LocalDbConnectionProvider : DbConnectionProvider {
    override fun getConnection(): Connection = DriverManager.getConnection("jdbc:sqlite:dictionary.db")
}

