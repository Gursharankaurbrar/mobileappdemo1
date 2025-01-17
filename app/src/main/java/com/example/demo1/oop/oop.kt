package com.example.demo1.oop

fun main(){
    var shark = Animal("Shark", "Chomping")
    var monkey = Animal("Monkey", "Squealing")

    println(shark.makeSound())
    println(monkey.makeSound())

    val bird = Bird("Sparrow", "Chirp")
    bird.makeSound()
    bird.fly()
}
