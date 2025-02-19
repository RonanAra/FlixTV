package br.com.tvflix.data.remote.repository

import br.com.tvflix.data.remote.datasource.MoviesDataSource
import br.com.tvflix.data.remote.models.MoviesResponse
import br.com.tvflix.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val moviesDataSource: MoviesDataSource
) : MoviesRepository {
    override suspend fun getPopular(): MoviesResponse {
        return moviesDataSource.getPopular()
    }

    override suspend fun getRecommend(): MoviesResponse {
        return moviesDataSource.getRecommend()
    }

    override suspend fun getTopRated(): MoviesResponse {
        return moviesDataSource.getTopRated()
    }
}