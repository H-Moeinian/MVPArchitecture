package com.example.mvparchitecture

import com.example.mvparchitecture.MovieDatabase.Search

class MVPPresenter(val view: MainActivity) {
    val model = MVPModel(this)
    fun movieInformationArrived(list:ArrayList<Search>) {
        view.showMovieInformation(list)
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getMovieInformation(movieTitle: String) {
        model.fetchRelatedMovies(movieTitle)


    }
}