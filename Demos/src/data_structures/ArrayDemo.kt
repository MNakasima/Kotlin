package data_structures

fun main(){

    println("=== Array ===")

    println("Enter number of names: ")
    val maxSize = readLine()!!.toInt()
    var listOfName:Array<String> = Array(maxSize){""}

    for(i in 0 until maxSize){
        println("Enter name:")
        listOfName[i] = readLine().toString()
    }

    for(i in 0 until maxSize){
        println("Pet $i: ${listOfName[i]}")
    }

}