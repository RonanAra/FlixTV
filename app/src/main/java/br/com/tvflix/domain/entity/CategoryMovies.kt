package br.com.tvflix.domain.entity

import br.com.tvflix.R

enum class CategoryMovies(val titleRes: Int) {
    POPULAR(R.string.title_popular_movies),
    TOP_RATED(R.string.title_top_rated_movies),
    RECOMMENDED(R.string.title_recommended_movies)
}