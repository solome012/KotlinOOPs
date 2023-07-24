package Polymorphism
/*
Compile-time (or Static) Polymorphism:
Also known as method overloading or static binding.
Occurs when the decision about which method to call is
made during the compile-time phase of the program.
In method overloading, multiple methods with the same name but different parameter
types are defined in the same class. The appropriate method is chosen based on
the number or type of arguments passed to it.

 */

open class Mobile1 {
    open fun call (){
        println(" A mobile can make a call")

    }

    // method overloading
    fun call ( name: String,  price: Int ){
        println(" the name of the mobile is $name ")
        println(" the price of the mobile is $price")
    }
}

fun main (){
    val c =  Mobile1()
   c.call()
    c.call("realme", 23000)

}