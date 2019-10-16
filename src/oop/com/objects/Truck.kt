package oop.com.objects

class Truck: CarOptions {

    var subType:String?=null

    constructor(brand:String, model:Int, price:Double, milesDrive:Int, owner:String, subType:String):
            super(brand, model, price, milesDrive, owner){

        this.subType = subType
    }

    constructor(brand:String, model:Int, price:Double, milesDrive:Int, subType:String):
            super(brand, model, price, milesDrive){

        this.subType = subType
    }

    override fun getCarPrice():Double{
        return this.getPrice()-(this.milesDrive!!.toDouble()*20)
    }

    fun getParentCarPriceWrapper():Double{
        return super.getCarPrice()
    }

}

//Extension
fun Truck.getCarPriceWrapper():Double{
    return this.getCarPrice() //cannot be super because it is a extension, this function does not know who the parent is.
}
