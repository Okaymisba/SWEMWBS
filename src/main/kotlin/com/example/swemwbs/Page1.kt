package com.example.swemwbs

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.stage.Stage

class Page1 {

    @FXML
    fun allTime1(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page2.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event?.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun noneOfTime1(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page2.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event?.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun often1(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page2.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event?.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun rarely1(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page2.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event?.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

    @FXML
    fun someTime1(event: MouseEvent) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page2.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event?.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()

    }

}
