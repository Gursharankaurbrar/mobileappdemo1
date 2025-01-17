package com.example.demo1.Challenge0

class Library(
    val booksList: MutableList<Book> = mutableListOf()
) {
    fun addBook(book: Book){
        booksList.add(book)
        println("Book added to the list.")
    }

    fun removeBook(title: String){
        booksList.removeIf { it.title == title }
    }

    fun displayAvailableBooks(){
        for(book in booksList){
            println(book)
        }
    }

    fun getAvailableBooksCountByAuthor( author: String) : Int {
        val bookCount = booksList.count{ it.author == author }
        return bookCount
    }
}