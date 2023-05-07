package com.beliakov.composesamples.features.survey.root.presentation.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.beliakov.composesamples.R
import com.beliakov.composesamples.root.presentation.theme.SamplesAppTheme

@Composable
fun SurveyToolbar(
    progressText: String,
    progressPercent: Float,
    onCloseClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = progressText,
                modifier = Modifier.align(Alignment.Center)
            )
            IconButton(
                onClick = onCloseClick,
                modifier = Modifier.align(Alignment.CenterEnd)
            ) {
                Icon(
                    imageVector = Icons.Rounded.Close,
                    contentDescription = stringResource(id = R.string.close)
                )
            }
        }
        LinearProgressIndicator(
            progress = progressPercent,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
    }
}

@Composable
@Preview
fun SurveyToolbarPreview() {
    SamplesAppTheme {
        SurveyToolbar(
            progressText = "2 of 6",
            progressPercent = 0.333f,
            onCloseClick = {}
        )
    }
}