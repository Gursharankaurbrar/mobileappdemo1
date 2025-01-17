package com.example.demo1.Challenge0

class Library(
    val booksList: MutableList<Book> = mutableListOf()
) {
    fun addBook(book: Book){
        booksList.add(book)
        println("$book added to the list.")
    }

    fun removeBook(title: String){
        booksList.removeIf { it.title == title }
    }

    fun displayAvailableBooks(){

        for(book in booksList){
            if(book.isAvailable == true){
            println(book)}
            else{
                println("$book currently not available")
            }
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

    fun getAvailableBooksCountByAuthor( author: String) {
        val bookCount = booksList.count{ it.author == author && it.isAvailable  }
        println(bookCount)
    }
}