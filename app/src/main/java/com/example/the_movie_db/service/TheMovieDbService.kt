package com.example.the_movie_db.service

import com.example.the_movie_db.model.MovieDbResult
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieDbService {
    @GET("movie/popular")
    suspend fun listPopularMovies(
        @Query("api_key") apiKey:String,
        @Query("region") region:String
    ): MovieDbResult
}