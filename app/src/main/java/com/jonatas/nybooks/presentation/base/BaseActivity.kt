package com.jonatas.nybooks.presentation.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

open class BaseActivity : AppCompatActivity() {

  protected  fun setupToolbar(toolbar: Toolbar, titleIdRes: Int, showBAckButton: Boolean = false) {
        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)
        if (showBAckButton){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }
}