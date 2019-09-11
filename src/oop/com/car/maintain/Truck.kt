package oop.com.car.maintain

class Truck:CarOptions{

    var subType:String?=null

    constructor(brand:String, model:Int, price:Double, milesDrive:Int, owner:String, subType:String):
            super(brand, model, price, milesDrive, owner){

        this.subType = subType
    }

    constructor(brand:String, model:Int, price:Double, milesDrive:Int, subType:String):
            super(brand, model, price, milesDrive){

        this.subType = subType
    }


}
