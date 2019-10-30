package com.example.mvparchitecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mvparchitecture.MovieDatabase.Search
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val presenter = MVPPresenter(this)
    val searchList = ArrayList<Search>()
    lateinit var adapter :RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSearch.setOnClickListener {
            val movieTitle = this.edtMovieTitle.text.toString()
            presenter.getMovieInformation(movieTitle)

        }
    }
    fun setRecyclerView() {
        adapter = RecyclerViewAdapter(searchList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
    }

    fun showMovieInformation(list:ArrayList<Search>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
