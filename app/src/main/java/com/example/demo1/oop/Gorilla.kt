package com.example.demo1.oop

class Gorilla (type:String, sound: String) : Animal(type, sound){
    init{
        println("Gorilla created")

    }
    fun eatBananas(){
        println("Gorilla is eating bananas.")
    }
}