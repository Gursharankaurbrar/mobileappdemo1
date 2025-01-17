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
    println(letterGrades)
    val result1 = sumNumbers(1, 3, 5)
    val result2 = sumNumbers(4, 5, 6, 7)

    println("Sum 1: $result1") // Output: Sum 1: 9
    println("Sum 2: $result2")// Output: Sum 2: 22}
    val sub = {a: Int, b:Int -> a-b}
    hof(sub)
}
fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()}
fun hof(subtraction: (Int, Int) -> Int){
    val result = subtraction(6,4)   //invoking function within function

    println(result)
}



