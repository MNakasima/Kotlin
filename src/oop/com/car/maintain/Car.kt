package oop.com.car.maintain

class Car(val brand:String, val model:Int, val price:Double, val milesDrive:Int, val owner:String){

    init{
        println("Object class created")
    }

    fun getCarPrice():Double{
        return this.price-(milesDrive.toDouble()*10)
    }

}