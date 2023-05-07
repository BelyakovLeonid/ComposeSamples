package com.beliakov.composesamples.features.survey.base.domain.model

class SurveyQuestionAnswer(
    val id: AnswerId,
    val answerText: String
)

typealias AnswerId = Int