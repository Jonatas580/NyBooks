package com.jonatas.nybooks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jonatas.nybooks.databinding.ActivityBooksBinding
import com.jonatas.nybooks.presentation.base.BaseActivity


class BooksActivity : BaseActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar(binding.includeToolbar.toolbarMain, R.string.boo)

    }


}