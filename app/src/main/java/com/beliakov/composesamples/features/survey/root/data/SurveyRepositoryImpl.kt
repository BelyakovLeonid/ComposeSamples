package com.beliakov.composesamples.features.survey.root.data

import com.beliakov.composesamples.features.survey.base.domain.model.SurveyQuestion
import com.beliakov.composesamples.features.survey.base.domain.model.SurveyQuestionAnswer
import com.beliakov.composesamples.features.survey.root.domain.SurveyRepository

class SurveyRepositoryImpl : SurveyRepository {

    override fun getFakeSurveyQuestions(): List<SurveyQuestion> {
        return listOf(
            SurveyQuestion.Radio(
                id = 1,
                questionText = "What is your preferred method of transportation?",
                answers = listOf(
                    SurveyQuestionAnswer(1, "Car"),
                    SurveyQuestionAnswer(2, "Bike"),
                    SurveyQuestionAnswer(3, "Public transportation"),
                    SurveyQuestionAnswer(4, "Walk")
                )
            ),
            SurveyQuestion.CheckBox(
                id = 2,
                questionText = "Which of the following activities do you enjoy?",
                answers = listOf(
                    SurveyQuestionAnswer(1, "Reading"),
                    SurveyQuestionAnswer(2, "Watching TV"),
                    SurveyQuestionAnswer(3, "Playing sports"),
                    SurveyQuestionAnswer(4, "Playing video games"),
                    SurveyQuestionAnswer(5, "Other")
                )
            ),
            SurveyQuestion.Radio(
                id = 3,
                questionText = "How often do you exercise?",
                answers = listOf(
                    SurveyQuestionAnswer(1, "Every day"),
                    SurveyQuestionAnswer(2, "A few times a week"),
                    SurveyQuestionAnswer(3, "Once a week"),
                    SurveyQuestionAnswer(4, "Less than once a week"),
                    SurveyQuestionAnswer(5, "Never")
                )
            ),
            SurveyQuestion.Comment(
                id = 4,
                questionText = "Do you have any additional feedback or comments?"
            )
        )
    }
}