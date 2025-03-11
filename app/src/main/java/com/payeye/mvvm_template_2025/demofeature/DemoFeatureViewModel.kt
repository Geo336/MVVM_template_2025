package com.payeye.mvvm_template_2025.demofeature

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class DemoFeatureViewModel() : ViewModel() {

    init {
        loadFeatureData()
    }

    data class DemoFeatureUiState(
        val isLoading: Boolean = false,
        val demoFeatureData: String = ""
    )

    private val _uiState = MutableStateFlow(DemoFeatureUiState())
    val uiState: StateFlow<DemoFeatureUiState> = _uiState.asStateFlow()

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