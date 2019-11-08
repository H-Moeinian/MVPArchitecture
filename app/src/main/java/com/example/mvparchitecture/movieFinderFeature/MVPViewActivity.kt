package com.example.mvparchitecture.movieFinderFeature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvparchitecture.MovieDatabase.Search
import com.example.mvparchitecture.R
import kotlinx.android.synthetic.main.activity_main.*

class MVPViewActivity : AppCompatActivity(),MVPContract.MVPView {


    val searchList = ArrayList<Search>()
    lateinit var adapter: RecyclerViewAdapter
    lateinit var presenter:MVPContract.MVPPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpRecyclerView()
        presenter = MVPPresenter(this)


        btnSearch.setOnClickListener {
            val movieTitle = this.edtMovieTitle.text.toString()
            presenter.getMovieInformation(movieTitle)

        }
    }

    override fun setUpRecyclerView() {
        adapter = RecyclerViewAdapter(searchList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

   override fun showMovieInformation(list: ArrayList<Search>) {
        searchList.clear()
        searchList.addAll(list)
        adapter.notifyDataSetChanged()
    }


}
