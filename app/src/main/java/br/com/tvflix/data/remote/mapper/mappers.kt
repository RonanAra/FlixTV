package br.com.tvflix.data.remote.mapper

import br.com.tvflix.domain.entity.Movie
import br.com.tvflix.data.remote.models.MovieItemResponse
import br.com.tvflix.utils.extensions.getYear

fun List<MovieItemResponse>.mapperToMovieModel(): List<Movie> {
    return this.map { movie ->
        with(movie) {
            Movie(
                title = title,
                poster = posterPath,
                year = releaseDate.getYear()
            )
        }
    }
}