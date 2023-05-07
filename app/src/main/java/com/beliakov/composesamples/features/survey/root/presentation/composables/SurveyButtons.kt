package com.beliakov.composesamples.features.survey.root.presentation.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.beliakov.composesamples.R
import com.beliakov.composesamples.root.presentation.theme.SamplesAppTheme

@Composable
fun SurveyButtons(
    isFirst: Boolean,
    isLast: Boolean,
    onPreviousClick: () -> Unit,
    onNextClick: () -> Unit,
    onFinishClick: () -> Unit
) {
    Row {
        if (!isFirst) {
            OutlinedButton(
                onClick = onPreviousClick,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = stringResource(R.string.previous))
            }
        }
        if (!isLast) {
            OutlinedButton(
                onClick = onNextClick,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = stringResource(R.string.next))
            }
        }
        if (isLast) {
            OutlinedButton(
                onClick = onFinishClick,
                modifier = Modifier.weight(1f)
            ) {
                Text(text = stringResource(R.string.finish))
            }
        }
    }
}

@Composable
@Preview
fun SurveyButtonsPreview() {
    SamplesAppTheme {
        SurveyButtons(
            isFirst = true,
            isLast = false,
            onPreviousClick = {},
            onNextClick = {},
            onFinishClick = {}
        )
    }
}
