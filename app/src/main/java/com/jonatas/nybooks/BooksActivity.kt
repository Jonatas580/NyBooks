package com.jonatas.nybooks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jonatas.nybooks.data.model.Book
import com.jonatas.nybooks.databinding.ActivityBooksBinding
import com.jonatas.nybooks.presentation.BooksAdapter
import com.jonatas.nybooks.presentation.base.BaseActivity


class BooksActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)



        with(binding.recyclerBooks) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())
        }
    }

    fun getBooks(): List<Book> {
        return listOf<Book>(
            Book("Title1", "Aythor1"),
            Book("Title2", "Aythor2"),
            Book("Title3", "Aythor3")
        )
    }


}