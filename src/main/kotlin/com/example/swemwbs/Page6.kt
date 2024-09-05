package com.example.swemwbs

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.stage.Stage

class Page6 {

    @FXML
    fun allTime6(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page7.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun noneOfTime6(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page7.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun often6(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page7.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun rarely6(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page7.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun someTime6(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page7.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

}
