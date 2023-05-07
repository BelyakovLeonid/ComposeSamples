package com.beliakov.composesamples.features.survey.root.presentation

import androidx.lifecycle.ViewModel
import com.beliakov.composesamples.features.survey.base.presentation.model.mapper.SurveyQuestionUiMapper
import com.beliakov.composesamples.features.survey.root.data.SurveyRepositoryImpl
import com.beliakov.composesamples.features.survey.root.domain.SurveyRepository
import com.beliakov.composesamples.features.survey.root.presentation.model.SurveyUiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class SurveyViewModel : ViewModel() {
    private val repo: SurveyRepository = SurveyRepositoryImpl()
    private val mapper = SurveyQuestionUiMapper()

    private val _state = MutableStateFlow(getInitialState())
    val state: StateFlow<SurveyUiState> = _state.asStateFlow()

    private fun getInitialState(): SurveyUiState {
        val questions = repo.getFakeSurveyQuestions()

        return SurveyUiState(
            progressText = "1 of ${questions.size}", // todo to resources
            progressPercent = 0f,
            questions = questions.map(mapper::map),
            currentQuestionIndex = 0,
            isFirstQuestion = true,
            isLastQuestion = false,
        )
    }

    fun onPreviousClick() {
        val decIndex = _state.value.currentQuestionIndex - 1
        val newIndex = (decIndex).coerceAtLeast(0)
        updateCurrentQuestionIndex(newIndex)
    }

    fun onNextClick() {
        val incIndex = _state.value.currentQuestionIndex + 1
        val newIndex = (incIndex).coerceAtMost(_state.value.questions.lastIndex)
        updateCurrentQuestionIndex(newIndex)
    }

    private fun updateCurrentQuestionIndex(newIndex: Int) {
        val questionsCount = _state.value.questions.lastIndex

        _state.value = _state.value.copy(
            progressText = "${newIndex + 1} of $questionsCount",
            progressPercent = newIndex.toFloat() / questionsCount,
            isFirstQuestion = newIndex == 0,
            isLastQuestion = newIndex == questionsCount - 1,
            currentQuestionIndex = newIndex
        )
    }

    fun onFinishClick() {

    }
}
