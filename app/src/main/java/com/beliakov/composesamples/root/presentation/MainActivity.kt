package com.beliakov.composesamples.root.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import com.beliakov.composesamples.features.survey.root.presentation.SurveyScreen
import com.beliakov.composesamples.root.presentation.composables.MainScreen
import com.beliakov.composesamples.root.presentation.theme.SamplesAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SamplesAppTheme {
                SurveyScreen()
            }
        }
    }
}
