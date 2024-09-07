package com.example.swemwbs

import javafx.fxml.FXML
import javafx.scene.control.Label

class ResultPage {

    @FXML
    private lateinit var resultLabel: Label

    @FXML
    fun initialize() {
        val score = calculateScale(scale)
        resultLabel.text = score.toString()
    }
}