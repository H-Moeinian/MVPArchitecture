package com.example.mvparchitecture.movieFinderFeature

import com.example.mvparchitecture.MovieDatabase.MovieClass
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("?apikey=4f3ca53")
    fun getRelatedMovies(@Query("s") s: String): Observable<MovieClass>


}