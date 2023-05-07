package com.beliakov.composesamples.features.survey.root.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.beliakov.composesamples.features.survey.root.presentation.composables.SurveyButtons
import com.beliakov.composesamples.features.survey.root.presentation.composables.SurveyQuestions
import com.beliakov.composesamples.features.survey.root.presentation.composables.SurveyToolbar

@Composable
fun SurveyScreen() {
    val viewModel: SurveyViewModel = viewModel()

    val state by viewModel.state.collectAsState()

    Column {
        SurveyToolbar(
            progressText = state.progressText,
            progressPercent = state.progressPercent,
            onCloseClick = {}
        )
        SurveyQuestions()
        SurveyButtons(
            isFirst = state.isFirstQuestion,
            isLast = state.isLastQuestion,
            onPreviousClick = viewModel::onPreviousClick,
            onNextClick = viewModel::onNextClick,
            onFinishClick = viewModel::onFinishClick
        )
    }
}