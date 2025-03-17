package com.payeye.mvvm_template_2025.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    data class DemoFeatureUiState(
        val isLoading: Boolean = true,
        val demoFeatureData: String = ""
    )

    private val _uiState = MutableStateFlow(DemoFeatureUiState())
    val uiState: StateFlow<DemoFeatureUiState> = _uiState.asStateFlow()

    init {
        loadFeatureData()
    }

    private fun loadFeatureData() {
        viewModelScope.launch {
            _uiState.update { it.copy(isLoading = true) }
            delay(2000)
            _uiState.update {
                it.copy(
                    isLoading = false,
                    demoFeatureData = "Demo Feature Data Loaded"
                )
            }
        }

    }
}