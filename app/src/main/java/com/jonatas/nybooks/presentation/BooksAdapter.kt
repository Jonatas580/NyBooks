package com.jonatas.nybooks.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jonatas.nybooks.data.model.Book
import com.jonatas.nybooks.databinding.ItemBookBinding

class BooksAdapter(val books : List<Book>) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    class BooksViewHolder(binding: ItemBookBinding) : RecyclerView.ViewHolder(binding.root) {

        private val bookAuthor =binding.textAuthor
        private val bookTitle = binding.textTitle

        fun bindView(book: Book) {
            bookTitle.text = book.title
            bookAuthor.text = book.author
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val viewBinding = ItemBookBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return BooksViewHolder(viewBinding)
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        val book = books[position]
        holder.bindView(book)
    }
}