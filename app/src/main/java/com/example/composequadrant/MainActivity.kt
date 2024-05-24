package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold() {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        Row(modifier.weight(1f)) {
            ComposeCard(
                title = stringResource(R.string.title_1),
                description = stringResource(R.string.description_1),
                backgroundColor = Color(0xFFEADDFF),
                modifier.weight(1f)
            )
            ComposeCard(
                title = stringResource(R.string.title_2),
                description = stringResource(R.string.description_2),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = modifier.weight(1f)
            )
        }
        Row(modifier.weight(1f)) {
            ComposeCard(
                title = stringResource(R.string.title_3),
                description = stringResource(R.string.description_3),
                backgroundColor = Color(0xFFB69DF8),
                modifier = modifier.weight(1f)
            )
            ComposeCard(
                title = stringResource(R.string.title_4),
                description = stringResource(R.string.description_4),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = modifier.weight(1f)
            )
        }
    }

}

@Composable
fun ComposeCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun ComposeQuadrantAppPreview() {
    ComposeQuadrantApp()
}

