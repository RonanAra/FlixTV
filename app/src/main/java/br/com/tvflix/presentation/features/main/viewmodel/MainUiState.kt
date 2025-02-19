package br.com.tvflix.presentation.features.main.viewmodel

import br.com.tvflix.domain.entity.Movie

sealed interface MainUiState {
    data class Error(val message: String) : MainUiState
    data class Loading(val loading: Boolean) : MainUiState
    data class Success(
        val popularMovies: List<Movie>,
        val topRatedMovies: List<Movie>,
        val recommendedMovies: List<Movie>
    ) : MainUiState
}