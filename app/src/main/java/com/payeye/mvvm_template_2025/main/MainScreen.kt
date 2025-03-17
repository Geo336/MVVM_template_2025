package com.payeye.mvvm_template_2025.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.payeye.mvvm_template_2025.navigation.NavRoutes
import com.payeye.mvvm_template_2025.utils.LoadingContent
import dagger.hilt.android.lifecycle.HiltViewModel

@Composable
fun MainScreen(navController: NavHostController,
               mainViewModel: MainViewModel = hiltViewModel()
) {
    val uiState by mainViewModel.uiState.collectAsStateWithLifecycle()
    LoadingContent(loading = uiState.isLoading, false, emptyContent = {
        Text("Empty Content")
    }) {

        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                modifier = Modifier
                    .align(alignment = CenterHorizontally)
                    .padding(top = 64.dp), text =
                "Main Screen is ON"
            )

            Button(
                modifier = Modifier
                    .align(alignment = CenterHorizontally)
                    .padding(top = 32.dp),
                onClick = {
                    navController.navigate(NavRoutes.DETAIL)
                }) {
                Text("Click me")
            }
        }
    }
}