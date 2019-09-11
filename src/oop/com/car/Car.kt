package oop.com.car

class Car(val brand:String, val model:Int, val price:Double, val milesDrive:Int, val owner:String){


    init{
        println("Object class created")

        println(brand)
        println(model)
        println(price)
        println(milesDrive)
        println(owner)
        println(getCarPrice())

    }


    fun getCarPrice():Double{
        return this.price-(milesDrive.toDouble()*10)
    }

}