package oop.com.car.maintain

import java.util.*

fun main (){

    val car1 = Car("BMW",2015,10000.0,105, "Maruko")

    println(car1.model)
    println(car1.brand)
    println(car1.getCarPrice())

    val car2 = Car("Toyota",2005,11200.0,55, "Maruko")

    println(car2.price)
    println(car2.milesDrive)
    println(car2.getCarPrice())
    println(car2.owner)

    val listOfCar = arrayListOf<Car>()
    listOfCar.add(car1)
    listOfCar.add(car2)
    listOfCar.add(Car("KIA",1996,1100.0,10, "Maruko"))

    for(car in listOfCar){
        println("Owner: ${car.owner}")
        println("Price: ${car.getCarPrice()}")
    }

}