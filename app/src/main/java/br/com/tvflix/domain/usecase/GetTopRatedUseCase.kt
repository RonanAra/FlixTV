package br.com.tvflix.domain.usecase

import br.com.tvflix.data.remote.mapper.mapperToMovieModel
import br.com.tvflix.domain.entity.Movie
import br.com.tvflix.domain.repository.MoviesRepository

interface GetTopRatedUseCase {
    suspend operator fun invoke(): List<Movie>
}

class GetTopRatedUseCaseImpl(
    private val repository: MoviesRepository
) : GetPopularUseCase {
    override suspend fun invoke(): List<Movie> {
        return repository.getTopRated().results.mapperToMovieModel()
    }
}