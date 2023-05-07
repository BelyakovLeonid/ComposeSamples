package com.beliakov.composesamples.features.survey.root.domain

import com.beliakov.composesamples.features.survey.base.domain.model.SurveyQuestion

interface SurveyRepository {
    fun getFakeSurveyQuestions(): List<SurveyQuestion>
}