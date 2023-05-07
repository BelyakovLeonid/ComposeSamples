package com.beliakov.composesamples.features.survey.root.presentation.model

import com.beliakov.composesamples.features.survey.base.presentation.model.SurveyQuestionUiModel

data class SurveyUiState(
    val progressText: String,
    val progressPercent: Float,
    val questions: List<SurveyQuestionUiModel>,
    val currentQuestionIndex: Int,
    val isFirstQuestion: Boolean,
    val isLastQuestion: Boolean
)