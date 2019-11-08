package com.example.mvparchitecture.movieFinderFeature

import com.example.mvparchitecture.MovieDatabase.Search

class MVPPresenter(val view: MVPContract.MVPView) : MVPContract.MVPPresenter {
    val model = MVPModel(this)

    override fun getMovieInformation(movieTitle: String) {
        model.fetchRelatedMovies(movieTitle)
    }

    override fun movieInformationArrived(list: ArrayList<Search>) {
        view.showMovieInformation(list)
    }


}