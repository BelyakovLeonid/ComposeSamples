package com.beliakov.composesamples.features.survey.base.presentation.model.mapper

import com.beliakov.composesamples.features.survey.base.domain.model.SurveyQuestion
import com.beliakov.composesamples.features.survey.base.presentation.model.SurveyQuestionUiModel

class SurveyQuestionUiMapper {

    fun map(question: SurveyQuestion): SurveyQuestionUiModel {
        return when (question) {
            is SurveyQuestion.Comment -> SurveyQuestionUiModel.Comment(
                id = question.id,
                questionText = question.questionText
            )

            is SurveyQuestion.Radio -> SurveyQuestionUiModel.Radio(
                id = question.id,
                questionText = question.questionText,
                answers = question.answers,
            )

            is SurveyQuestion.CheckBox -> SurveyQuestionUiModel.CheckBox(
                id = question.id,
                questionText = question.questionText,
                answers = question.answers,
            )
        }
    }
}