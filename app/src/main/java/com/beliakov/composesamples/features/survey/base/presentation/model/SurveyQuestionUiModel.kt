package com.beliakov.composesamples.features.survey.base.presentation.model

import com.beliakov.composesamples.features.survey.base.domain.model.AnswerId
import com.beliakov.composesamples.features.survey.base.domain.model.QuestionId
import com.beliakov.composesamples.features.survey.base.domain.model.SurveyQuestionAnswer

sealed class SurveyQuestionUiModel(
    open val id: QuestionId
) {

    data class Comment(
        override val id: QuestionId,
        val questionText: String,
        val currentAnswer: String = ""
    ) : SurveyQuestionUiModel(id)

    data class Radio(
        override val id: QuestionId,
        val questionText: String,
        val answers: List<SurveyQuestionAnswer>,
        val selectedAnswerId: AnswerId? = null
    ) : SurveyQuestionUiModel(id)

    data class CheckBox(
        override val id: QuestionId,
        val questionText: String,
        val answers: List<SurveyQuestionAnswer>,
        val selectedAnswersIds: List<AnswerId> = emptyList()
    ) : SurveyQuestionUiModel(id)
}
