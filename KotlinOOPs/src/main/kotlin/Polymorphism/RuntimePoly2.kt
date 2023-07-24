package Polymorphism

open class Mobile {
    open fun call() {
        println("A mobile can make a call")
    }
}

class SmartPhone : Mobile() {
    override fun call() {
        println("A smartphone can make a call and do more!")
    }

    fun browseInternet() {
        println("A smartphone can browse the internet.")
    }
}

fun main() {
    val mobile1: Mobile = Mobile()
    val mobile2: Mobile = SmartPhone()

    mobile1.call() // Output: "A mobile can make a call"
    mobile2.call() // Output: "A smartphone can make a call and do more!"

    // Uncommenting the line below would result in a compilation error
    // mobile2.browseInternet()
    /*
    Now, you can call the call() method on mobile2, which will execute the
    overridden method from the SmartPhone class because of dynamic polymorphism.

However, attempting to call mobile2.browseInternet() would result
in a compilation error because the compiler only knows that mobile2
 is of type Mobile, and it does not have knowledge of the methods
  specific to the SmartPhone class. To access the browseInternet()
   method, you need to declare mobile2 as a SmartPhone object explicitly:
     */

    val mobile3 = SmartPhone()
    mobile3.browseInternet() // Output: "A smartphone can browse the internet."

}