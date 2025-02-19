package br.com.tvflix.data.remote.service

import br.com.tvflix.data.remote.models.MoviesResponse
import retrofit2.http.GET

interface MoviesService {

    @GET("movie/popular")
    suspend fun getPopularMovies(): MoviesResponse

    @GET("movie/upcoming")
    suspend fun getRecommendedMovies(): MoviesResponse

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(): MoviesResponse
}