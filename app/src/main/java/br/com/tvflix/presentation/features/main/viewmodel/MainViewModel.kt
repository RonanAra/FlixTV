package br.com.tvflix.presentation.features.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.tvflix.domain.usecase.GetPopularUseCase
import br.com.tvflix.domain.usecase.GetRecommendUseCase
import br.com.tvflix.domain.usecase.GetTopRatedUseCase
import br.com.tvflix.utils.extensions.launchSuspendFunZip
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getPopularUseCase: GetPopularUseCase,
    private val getRecommendUseCase: GetRecommendUseCase,
    private val getTopRatedUseCase: GetTopRatedUseCase,
) : ViewModel() {

    private val _uiState: MutableLiveData<MainUiState> = MutableLiveData()
    val uiState: LiveData<MainUiState> = _uiState

    fun loadMovies() {
        viewModelScope.launchSuspendFunZip(
            firstBlockToRun = { getPopularUseCase() },
            secondBlockToRun = { getRecommendUseCase() },
            thirdBlockToRun = { getTopRatedUseCase() },
            onLoading = { loading ->
                _uiState.value = MainUiState.Loading(loading)
            },
            onSuccess = {
                _uiState.value = MainUiState.Success(
                    popularMovies = it.first,
                    topRatedMovies = it.third,
                    recommendedMovies = it.second
                )
            },
            onError = { error ->
                _uiState.value = MainUiState.Error(error.message.orEmpty())
            }
        )
    }
}