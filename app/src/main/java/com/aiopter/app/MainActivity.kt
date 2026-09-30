package com.aiopter.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    AIopterMvpApp()
                }
            }
        }
    }
}

@Composable
private fun AIopterMvpApp() {
    var onboardingComplete by rememberSaveable { mutableStateOf(false) }
    if (!onboardingComplete) {
        OnboardingScreen(onContinue = { onboardingComplete = true })
    } else {
        MvpHomeScreen()
    }
}

@Composable
private fun OnboardingScreen(onContinue: () -> Unit) {
    var step by rememberSaveable { mutableIntStateOf(0) }
    val steps = listOf(
        "Welcome to AIopter",
        "Ask questions by text or voice. AIopter answers inside a compact panel.",
        "Privacy first: request permissions only when needed, and stop anytime with Quick Kill."
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = steps[step], style = MaterialTheme.typography.headlineSmall, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Step ${step + 1} of ${steps.size}",
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(24.dp))
        if (step < steps.lastIndex) {
            Button(onClick = { step++ }, modifier = Modifier.fillMaxWidth()) {
                Text("Next")
            }
        } else {
            Button(onClick = onContinue, modifier = Modifier.fillMaxWidth()) {
                Text("Finish onboarding")
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        if (step > 0) {
            OutlinedButton(onClick = { step-- }, modifier = Modifier.fillMaxWidth()) {
                Text("Back")
            }
        }
    }
}

@Composable
private fun MvpHomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "AIopter MVP",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "• Ask a question\n• Get concise AI help\n• Control permissions\n\nMonetization mode: ad-supported free tier (configured in release checklist).",
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
