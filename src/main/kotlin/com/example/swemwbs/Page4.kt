package com.example.swemwbs

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.stage.Stage

class Page4 {

    @FXML
    fun allTime4(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page5.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun noneOfTime4(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page5.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun often4(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page5.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun rarely4(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page5.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun someTime4(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page5.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

}
