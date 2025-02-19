package br.com.tvflix.domain.usecase

import br.com.tvflix.data.remote.mapper.mapperToMovieModel
import br.com.tvflix.domain.entity.Movie
import br.com.tvflix.domain.repository.MoviesRepository

interface GetRecommendUseCase {
    suspend operator fun invoke(): List<Movie>
}

class GetRecommendUseCaseImpl(
    private val repository: MoviesRepository
) : GetPopularUseCase {
    override suspend fun invoke(): List<Movie> {
        return repository.getRecommend().results.mapperToMovieModel()
    }
}