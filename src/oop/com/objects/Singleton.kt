package oop.com.objects

class Singleton {
    var name:String? = null

    constructor(){
        println("Instance created")
    }

    companion object{
        val instance:Singleton by lazy {Singleton()}
    }

}