package com.example.the_movie_db

import android.graphics.Movie
import android.util.Log

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import org.json.JSONObject

/*class GetAllMovies {
    companion object {
        suspend fun send() : List<Movie> {


            val client = OkHttpClient()
            val url = "https://api.themoviedb.org/3/movie/550?api_key=938e47f64138ce8e88b9b7ddb97759e6"
             val BASE_IMG_URL ="https://image.tmdb.org/t/p/w500"
            val request = Request.Builder()
                .url(url)
                .build()
            val call = client.newCall(request)

            return withContext(Dispatchers.IO) {
                val response = call.execute()
                response.body?.string()?.let {
                    Log.w("GetAllMovies", it)
                    val jsonObject = JSONObject(it)

                    val results = jsonObject.optJSONArray("results")
                    results?.let {
                        Log.w("GetAllFilms", results.toString())
                        val gson = Gson()

                        val itemType = object : TypeToken<List<Movie>>() {}.type

                        val list = gson.fromJson<List<Movie>>(results.toString(), itemType)
                        return@withContext list
                    }
                }
                return@withContext emptyList()
            }
        }
    }
}*/