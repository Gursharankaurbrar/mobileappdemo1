package com.example.demo1.oop

class Person{
    var name: String = "Gursharan Brar"

    // getter and setter
         get() = field
        set(value){
            field = value
        }
    var age: Int = 25
        get() {
            println("Getter called")
            return field
        }
        set(value){
            if (value > 0) {
                field = value
            } else {
                println("Age must be positive")
            }
        }
}

fun main(){
    var mike = Person()
    println(mike.name)
    println(mike.age)

    mike.name = "Mike"
    mike.age = 40
    println(mike.name)
    println(mike.age)

}