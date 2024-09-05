package com.example.swemwbs

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.input.MouseEvent
import javafx.stage.Stage

class MainPage {

    @FXML
    private lateinit var startBtn: Button

    @FXML
    fun startQuestions(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page1.fxml"))
        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
        val stage = (event?.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

}
