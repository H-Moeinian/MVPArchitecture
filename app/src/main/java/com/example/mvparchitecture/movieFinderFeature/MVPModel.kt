package com.example.mvparchitecture.movieFinderFeature

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class MVPModel(val presenter: MVPPresenter) {


val disposable = CompositeDisposable()

    fun fetchRelatedMovies(name:String){
        val retrofit = Retrofit.Builder()
            .baseUrl("https://www.omdbapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
         disposable.add(retrofit.create(RetrofitInterface::class.java)
             .getRelatedMovies(name)
             .subscribeOn(Schedulers.io())
             .observeOn(AndroidSchedulers.mainThread())
             .subscribe({
                 presenter.movieInformationArrived(it.search)

             },
                 {}))
    }
}