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

    fun borrowBook( title: String ) : Boolean {
        val requiredBook = booksList.find { it.title == title }
        return if ( requiredBook != null && requiredBook.isAvailable) {
            requiredBook.isAvailable = false
            println("You have successfully borrowed $title")
            return true
        }
        else{
            println("Sorry, $title  is currently unavailable.")
            return false
        }
    }

    fun getAvailableBooksCountByAuthor( author: String) : Int {
        val bookCount = booksList.count{ it.author == author && it.isAvailable  }
        return bookCount
    }
}