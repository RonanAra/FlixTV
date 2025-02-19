package br.com.tvflix.domain.usecase

import br.com.tvflix.data.remote.mapper.mapperToMovieModel
import br.com.tvflix.domain.entity.Movie
import br.com.tvflix.domain.repository.MoviesRepository

interface GetPopularUseCase {
    suspend operator fun invoke(): List<Movie>
}

class GetPopularUseCaseImpl(
    private val repository: MoviesRepository,
) : GetPopularUseCase {
    override suspend fun invoke(): List<Movie> {
        return repository.getPopular().results.mapperToMovieModel()
    }
}