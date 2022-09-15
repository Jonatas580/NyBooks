package com.jonatas.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.jonatas.nybooks.R
import com.jonatas.nybooks.data.model.Book
import com.jonatas.nybooks.databinding.ActivityBooksBinding
import com.jonatas.nybooks.databinding.ItemBookBinding

class BooksAdapter(
    val books : List<Book>
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, view: Int): BooksViewHolder {
        val binding = ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BooksViewHolder(binding)

    }

    override fun onBindViewHolder(viewHolder: BooksViewHolder, position: Int) {

    }

    override fun getItemCount() = books.count()

    class BooksViewHolder(binding: ItemBookBinding) : RecyclerView.ViewHolder (binding.root) {

      private  val title = binding.textTitle
       private val author = binding.textAuthor


        fun bindView(book: Book) {
            title.text = book.title
            author.text = book.author

        }
    }
}