package com.example.swemwbs

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("main_page.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "The Short Warwick-Edinburgh Mental Wellbeing Scale"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}