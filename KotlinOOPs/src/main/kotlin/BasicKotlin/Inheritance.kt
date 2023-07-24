package BasicKotlin


// in kotlin you need to explictly write the open keyword to make the function inheritable

open class Mobile (val model: String, val price:Long, val type:String){
    init {


        println("Hi i am in the mobile class")
    }
}

// create the base class and inheritate the base class
class samsung:Mobile("samsumgGalaxy130", 20000 , "android"){
    fun samsung1(){
        println("$model")
        println("$price" )
        println("$type")}
}

class Iphone:Mobile("iPhone13ProMax", 1000000, "Apple"){
    fun Apple (){
        println("$model")
        println("$price" )
        println("$type")}

}

fun main() {
    // make the object the sub class and inherit the properties of the parent class
    val iphone = Iphone()
    iphone.Apple()

    // for the android class
    val samsu = samsung()
    samsu.samsung1()
}

/*

In Kotlin, the init block is an initializer block that is executed when an instance of a class
is created. It allows you to perform initialization code and set up the object's state.

The init block is placed inside the class body, and it does not take any parameters.
 It is executed immediately after the primary constructor is called, but before any
 secondary constructors or other initialization code within the class
 */