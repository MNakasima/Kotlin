package oop.com.car.maintain

fun ArrayList<Int>.findMax():Int{

    var maxElement:Int = 0

    for(item in this){
        if(item > maxElement){
            maxElement = item
        }
    }
    return maxElement
}

fun main(){

    var listOfElements = arrayListOf<Int>()
    listOfElements.add(1)
    listOfElements.add(2)
    listOfElements.add(3)
    listOfElements.add(4)

    println("Max: ${listOfElements.findMax()}")


}