package oop.com.car.maintain

import java.util.*

fun main (){

    /*
    /*Car class*/
    val car1 = Car("BMW",2015,10000.0,105, "Maruko")

    val car2 = Car("Toyota",2005,11200.0,55, "Maruko")

    val listOfCar = arrayListOf<Car>()
    listOfCar.add(car1)
    listOfCar.add(car2)
    listOfCar.add(Car("KIA",1996,1100.0,10, "Maruko"))

    for(car in listOfCar){
        println("Owner: ${car.owner}")
        println("Price: ${car.getCarPrice()}")
    }
    */

    /*CarOptions class*/
    val car1 = CarOptions("BMW",2015,10000.0,105, "Maruko")

    val car2 = CarOptions("Toyota",2005,11200.0,55)

    val listOfCar = arrayListOf<CarOptions>()
    listOfCar.add(car1)
    listOfCar.add(car2)

    for(car in listOfCar){
        println("Owner: ${car.owner}")
        println("Price: ${car.getCarPrice()}")
    }



}