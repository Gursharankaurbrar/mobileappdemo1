package com.example.demo1

fun main() {
    // single line comment

    /*
    Multi-line comment
    */

    println("Hello World!")
    print("Hello Class!")
    print("Print doesnt add new line character.")

    // val is readonly variable, var can be changed

    // Kotlin deal with inferred data types, meaning we dont have to declare datatype

    var changingValue = 1
    changingValue = 2
    changingValue = 3
    println(changingValue)
    print(changingValue.javaClass)

    /*
    Functions
     */

    fun addNumbers(): Int{
        return 80 + 6
    }

    println(addNumbers())

    fun newAddNumbers (a: Int, b:Int) = a + b

    println(newAddNumbers(10, 45))
    println(newAddNumbers(b=7, a=4))

    val grades = listOf(2.0, 2.5, 3.0, 3.5, 4.0, 4.5)
    val letterGrades = grades.map{ grade ->
        when(grade){
            2.0 -> "C"
            2.5 -> "C+"
            3.0 -> "B"
            3.5 -> "B+"
            4.0 -> "A"
            4.5 -> "A+"
            else -> "Unknown"}
}
    println(letterGrades) }