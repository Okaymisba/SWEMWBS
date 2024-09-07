package com.example.swemwbs

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.input.MouseEvent
import javafx.stage.Stage

class Page3 {

    @FXML
    fun allTime3(event: MouseEvent) {
        val point = 5
        updateScale(point)

        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page4.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()


    }

    @FXML
    fun noneOfTime3(event: MouseEvent) {
        val point = 1
        updateScale(point)

        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page4.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()


    }

    @FXML
    fun often3(event: MouseEvent) {
        val point = 4
        updateScale(point)

        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page4.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()


    }

    @FXML
    fun rarely3(event: MouseEvent) {
        val point = 2
        updateScale(point)

        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page4.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()


    }

    @FXML
    fun someTime3(event: MouseEvent) {
        val point = 3
        updateScale(point)

        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("page4.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = (event.source as Node).scene.window as Stage
        stage.scene = scene
        stage.show()


    }

}
