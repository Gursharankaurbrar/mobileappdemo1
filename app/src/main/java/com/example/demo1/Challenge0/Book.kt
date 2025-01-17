package com.example.demo1.Challenge0

class Book(
    var title: String,
    var author: String,
    var isAvailable: Boolean
){
    override fun toString(): String {
        return "Book: $title , Author: $author"
    }

    fun borrowBook( book : Book ) : Any {
        return if (book.isAvailable) {
            book.isAvailable = false
            println("You have successfully borrowed $title by $author")
            return true
        }
        else{
            println("Sorry, $title by $author is currently unavailable.")
            return false
        }
    }


}