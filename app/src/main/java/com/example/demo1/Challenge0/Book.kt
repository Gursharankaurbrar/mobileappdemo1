package com.example.demo1.Challenge0

class Book(
    var title: String,
    var author: String
){
    override fun toString(): String {
        return "Book: $title , Author: $author"
    }
}