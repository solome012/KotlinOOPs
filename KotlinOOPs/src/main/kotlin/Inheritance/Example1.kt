package Inheritance

open class Mobile(val name:String,val model:String, var price: Int){
    fun mobile (){
        println("Hi, i am in the Mobile class")
    }
}

class Android: Mobile( "Realme", "eureoei", 1334){
    fun android(){
        println("The name of the mobile is $name")
        println(" The Model of the of the mobile is $model")
        println("The price of the mobile is $price")
    }
}

fun main (){
    val realme=Android()
    realme.android()
    realme.mobile()
}
