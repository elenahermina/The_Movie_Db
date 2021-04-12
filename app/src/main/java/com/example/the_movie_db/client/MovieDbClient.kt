package com.example.the_movie_db.client

import com.example.the_movie_db.service.TheMovieDbService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieDbClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service = retrofit.create(TheMovieDbService::class.java)
}