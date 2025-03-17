package com.payeye.mvvm_template_2025.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            modifier = Modifier
                .align(alignment = CenterHorizontally)
                .padding(top = 64.dp), text =
            "Detail Screen is ON"
        )
    }
}