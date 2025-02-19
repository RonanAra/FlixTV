package br.com.tvflix.domain.repository

import br.com.tvflix.domain.entity.Movie

interface MoviesRepository {
    suspend fun getPopular(): List<Movie>
    suspend fun getRecommend(): List<Movie>
    suspend fun getTopRated(): List<Movie>
}