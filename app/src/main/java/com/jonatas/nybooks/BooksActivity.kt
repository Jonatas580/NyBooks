package com.jonatas.nybooks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jonatas.nybooks.databinding.ActivityBooksBinding


class BooksActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setup

    }


}