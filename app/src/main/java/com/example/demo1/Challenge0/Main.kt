package com.example.demo1.Challenge0

fun main() {
    val library = Library()

    library.addBook(Book("The Great Gatsby", "F. Scott Fitzgerald", true))
    library.addBook(Book("1984", "George Orwell", true))
    library.addBook(Book("To Kill a Mockingbird", "Harper Lee", true))
    library.addBook(Book("The Catcher in the Rye", "J.D. Salinger", true))
    library.addBook(Book("Go Set a Watchman", "Harper Lee", true))
    library.addBook(Book("Mockingbird: A Portrait of Harper Lee", "Harper Lee", true))

    println("***********************************************************************************")
    println("\nAvailable Books:")
    library.displayAvailableBooks()

    println("***********************************************************************************")
    println("Count of Books by Harper Lee:")
    library.getAvailableBooksCountByAuthor("Harper Lee")
    library.borrowBook("Mockingbird: A Portrait of Harper Lee")

    println("***********************************************************************************")
    println("After borrowing:")
    library.getAvailableBooksCountByAuthor("Harper Lee")
    library.displayAvailableBooks()

    println("***********************************************************************************")
    library.removeBook("The Catcher in the Rye")
    println("After Removing:")
    library.displayAvailableBooks()
}