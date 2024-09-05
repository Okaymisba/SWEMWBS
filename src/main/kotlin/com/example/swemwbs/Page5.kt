package com.example.swemwbs

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.stage.Stage

class Page5 {

    @FXML
    fun allTime5(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page6.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun noneOfTime5(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page6.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun often5(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page6.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun rarely5(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page6.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun someTime5(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page6.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

}
