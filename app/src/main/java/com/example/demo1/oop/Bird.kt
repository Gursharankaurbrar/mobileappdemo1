package com.example.demo1.oop

class Bird(type: String, sound: String) : Animal(type, sound) {
    init{
        println("Bird created!")
    }
    fun fly(){
        println("$type flies")
    }
    override fun  makeSound(){
        println("$type makes a bird sound.")
    }
}