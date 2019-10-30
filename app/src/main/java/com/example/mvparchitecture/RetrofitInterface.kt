package com.example.mvparchitecture

import com.example.mvparchitecture.MovieDatabase.MovieClass
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("?apikey=70ad462a")
    fun getRelatedMovies(@Query("s") s: String): Observable<MovieClass>


}