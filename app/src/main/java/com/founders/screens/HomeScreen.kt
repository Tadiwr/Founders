package com.founders.screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.founders.custom_composables.CenteredAppBar

@Preview
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { CenteredAppBar("Founders 🧑‍💻")}
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            RoundedCard{Shangwa()}
            Spacer(modifier = Modifier.height(20.dp))
            RoundedCard{Saurombe()}
            Spacer(modifier = Modifier.height(20.dp))
            RoundedCard{Mushowe()}

        }

    }
}

@Composable
fun RoundedCard(
    content: @Composable() () -> Unit
) {
    Box(
        modifier = Modifier
            .background(Color.Blue)
            .fillMaxWidth()
            .padding(16.dp)
            .height(50.dp),
        contentAlignment = Alignment.Center,


    ) {
        content()
    }
}
