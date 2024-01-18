package com.muslim.simpleappcompose.test

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TestTextSimple() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            buildAnnotatedString {
                withStyle(SpanStyle(fontSize = 28.sp, fontWeight = FontWeight.Bold)) {
                    append("Hello")
                }

                withStyle(
                    SpanStyle(
                        textDecoration = TextDecoration.Underline
                    )
                ) {
                    append(" ")
                }

                withStyle(
                    SpanStyle(
                        fontSize = 26.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                ) {
                    append("my")
                }

                withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append(" ")
                }

                withStyle(
                    SpanStyle(
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 32.sp,
                        fontFamily = FontFamily.Cursive
                    )
                ) {
                    append("Android!")
                }
            }
        )
    }
}