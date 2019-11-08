package com.example.mvparchitecture.movieFinderFeature

import com.example.mvparchitecture.MovieDatabase.Search

interface MVPContract {

    interface MVPView{
        fun showMovieInformation(list: ArrayList<Search>)
        fun setUpRecyclerView()
    }
    interface MVPPresenter{
        fun getMovieInformation(movieTitle: String)

        fun movieInformationArrived(list: ArrayList<Search>)

    }
}