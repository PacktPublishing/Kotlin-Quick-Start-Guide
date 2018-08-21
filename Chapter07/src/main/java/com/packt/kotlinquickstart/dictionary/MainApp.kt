package com.packt.kotlinquickstart.dictionary

import com.packt.kotlinquickstart.dictionary.data.Repository
import javafx.application.Application
import javafx.stage.Stage
import javafx.scene.Scene
import javafx.fxml.FXMLLoader
import javafx.scene.Parent


class MainApp : Application() {

    private lateinit var stage: Stage

    init {
        instance = this
    }

    override fun start(primaryStage: Stage) {
        stage = primaryStage

        val repository = Repository()
        repository.onStart()
        if (repository.isDataLoaded()) {
            changeScene("main.fxml")
        } else {
            changeScene("loader.fxml")
        }

        primaryStage.show()
    }

    private fun changeScene(fxml: String, title: String = "Dictionary") {
        val page = FXMLLoader.load(javaClass.classLoader.getResource(fxml)) as Parent
        var scene = stage.scene
        stage.title = title
        if (scene == null) {
            scene = Scene(page, 900.0, 700.0)
            stage.scene = scene
        } else {
            stage.scene.root = page
        }
        stage.sizeToScene()
    }

    fun onDictionaryLoaded() {
        changeScene("main.fxml")
    }

    companion object {
        lateinit var instance: MainApp
    }
}