package br.com.tvflix.data.remote.repository

import br.com.tvflix.data.remote.datasource.MoviesDataSource
import br.com.tvflix.data.remote.mapper.mapperToMovieModel
import br.com.tvflix.domain.entity.Movie
import br.com.tvflix.domain.repository.MoviesRepository
import javax.inject.Inject

class MoviesRepositoryImpl @Inject constructor(
    private val moviesDataSource: MoviesDataSource
) : MoviesRepository {
    override suspend fun getPopular(): List<Movie> {
        return moviesDataSource.getPopular().results.mapperToMovieModel()
    }

    override suspend fun getRecommend(): List<Movie> {
        return moviesDataSource.getRecommend().results.mapperToMovieModel()
    }

    override suspend fun getTopRated(): List<Movie> {
        return moviesDataSource.getTopRated().results.mapperToMovieModel()
    }
}