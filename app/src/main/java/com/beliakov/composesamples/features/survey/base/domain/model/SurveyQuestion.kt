package com.beliakov.composesamples.features.survey.base.domain.model

sealed class SurveyQuestion(
    val id: QuestionId
) {

    class Comment(
        id: QuestionId,
        val questionText: String
    ) : SurveyQuestion(id)

    class Radio(
        id: QuestionId,
        val questionText: String,
        val answers: List<SurveyQuestionAnswer>
    ) : SurveyQuestion(id)

    class CheckBox(
        id: QuestionId,
        val questionText: String,
        val answers: List<SurveyQuestionAnswer>
    ) : SurveyQuestion(id)
}

typealias QuestionId = Int