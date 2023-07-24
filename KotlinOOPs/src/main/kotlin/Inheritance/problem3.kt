package Inheritance

/*
Problem 4:
Create an abstract class called Shape with a property name and an abstract method calculateArea().

Create two subclasses Circle and Rectangle that inherit from the Shape class.
 Implement the calculateArea() method in each subclass to return the actual
  area calculation for a circle and rectangle.

Create an instance of each subclass and call the calculateArea() method to print the calculated area.
 */

abstract class Shape1(val name:String){
    abstract fun calculateArea()
}

 class Circle1 : Shape1(name= "circle") {
    override fun calculateArea() {
       val pi = 10
        val r = 2
        val area = pi*r*r
        println("The area of the $name is $area")
    }
}

class rectangle1 : Shape1("rectangle"){
    override fun calculateArea() {
        val l = 10
        val b = 12
        val area = l*b
        println("The area of the rectangle is $area")

    }
}

fun main (){
    val r1 = rectangle1()
    r1.calculateArea()
    println()
    val c1 = Circle1()
    c1.calculateArea()
}