package com.example.demo1.oop

open class Animal(
    var type: String,
    var sound: String
) {
    open fun makeSound(){
        println("$type makes a $sound sound.")
    }
}