package oop.com.objects

open class CarOptions(){

    var brand:String?=null
    var model:Int?=null
    private var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null

    constructor(brand:String, model:Int, price:Double, milesDrive:Int, owner:String):this(){
        this.brand = brand
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    constructor(brand:String, model:Int, price:Double, milesDrive:Int):this(){
        this.brand = brand
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    open fun getCarPrice():Double{
        return this.price!!-(milesDrive!!.toDouble()*10)
    }

    fun getPrice():Double{
        return this.price!!
    }

}