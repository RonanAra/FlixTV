package br.com.tvflix.data.remote.datasource

import br.com.tvflix.data.remote.models.MoviesResponse
import br.com.tvflix.data.remote.service.MoviesService
import javax.inject.Inject

interface MoviesDataSource {
    suspend fun getPopular(): MoviesResponse
    suspend fun getRecommend(): MoviesResponse
    suspend fun getTopRated(): MoviesResponse
}

class MoviesDataSourceImpl @Inject constructor(
    private val service: MoviesService
) : MoviesDataSource {

    override suspend fun getPopular(): MoviesResponse {
        return service.getPopularMovies()
    }

    override suspend fun getRecommend(): MoviesResponse {
        return service.getRecommendedMovies()
    }

    override suspend fun getTopRated(): MoviesResponse {
        return service.getTopRatedMovies()
    }
}