package br.com.tvflix.data.remote.models

import com.google.gson.annotations.SerializedName

data class MoviesResponse(
    val results: List<MovieItemResponse>
)

data class MovieItemResponse(
    val id: Int,
    val title: String,
    @SerializedName("poster_path") val posterPath: String,
    @SerializedName("release_date") val releaseDate: String
)