package com.example.swemwbs

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.stage.Stage

class Page7 {

    @FXML
    fun allTime7(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("resultPage.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun noneOfTime7(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("resultPage.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun often7(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("resultPage.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun rarely7(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("resultPage.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun someTime7(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("resultPage.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

}
