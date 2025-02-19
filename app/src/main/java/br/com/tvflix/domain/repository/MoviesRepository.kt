package br.com.tvflix.domain.repository

import br.com.tvflix.data.remote.models.MoviesResponse

interface MoviesRepository {
    suspend fun getPopular(): MoviesResponse
    suspend fun getRecommend(): MoviesResponse
    suspend fun getTopRated(): MoviesResponse
}