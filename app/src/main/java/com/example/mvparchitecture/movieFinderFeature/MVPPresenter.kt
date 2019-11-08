package com.example.mvparchitecture.movieFinderFeature

import com.example.mvparchitecture.MovieDatabase.Search

class MVPPresenter(val view: MVPViewActivity) {
    val model = MVPModel(this)

    fun getMovieInformation(movieTitle: String) {
        model.fetchRelatedMovies(movieTitle)
    }

    fun movieInformationArrived(list: ArrayList<Search>) {
        view.showMovieInformation(list)
    }






}