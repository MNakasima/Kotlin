package oop.com.main

data class Person(val name:String, val age:Int, val gender:String)

fun main(){

    val person = Person("Maruko", 23, "Male")
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Gender: ${person.gender}")

}