package com.example.swemwbs

import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.text.Text

class ResultPage {

    @FXML
    private lateinit var heading: Text

    @FXML
    private lateinit var para: Text

    @FXML
    private lateinit var score: Label

    @FXML
    fun initialize() {
        when (val calculatedScore = calculateScale(scale)) {
            in 7..13 -> {
                score.text = "Score: $calculatedScore / 35"
                heading.text = "Very Low Well-being: "
                para.text = "Based on your score, you are in the very low well-being range. This suggests that you may be experiencing significant challenges such as persistent sadness, low energy, or difficulty managing daily life. It may be helpful to seek support to improve your mental well-being."
            }
            in 14..19 -> {
                score.text = "Score: $calculatedScore / 35"
                heading.text = "Low Well-being: "
                para.text = "Your score falls into the low well-being range. This means you might be facing mild stress, anxiety, or dissatisfaction. It's important to take steps to improve your mental health, and seeking support could be beneficial."
            }
            in 20..23 -> {
                score.text = "Score: $calculatedScore / 35"
                heading.text = "Below Average Well-being: "
                para.text = "Your score indicates below average well-being. While you may be coping with everyday challenges, occasional struggles with mental health may arise. Focusing on self-care and stress management could help improve your well-being."
            }
            in 24..27 -> {
                score.text = "Score: $calculatedScore / 35"
                heading.text = "Average Well-being: "
                para.text = "You are in the average well-being range. This suggests you handle daily challenges well, balancing both positive and negative emotions. Continue to maintain your mental well-being with healthy habits."
            }
            in 28..32 -> {
                score.text = "Score: $calculatedScore / 35"
                heading.text = "Above Average Well-being: "
                para.text = "Your score indicates above average well-being. You tend to manage stress effectively and feel generally positive and satisfied with life. Keep up your positive outlook and emotional resilience."
            }
            in 32..35 -> {
                score.text = "Score: $calculatedScore / 35"
                heading.text = "High Well-being: "
                para.text = "Based on your score, you are in the high well-being range. This suggests you are thriving, experiencing frequent happiness, life satisfaction, and strong emotional resilience. Keep nurturing your mental health."
            }
        }

    }

}
