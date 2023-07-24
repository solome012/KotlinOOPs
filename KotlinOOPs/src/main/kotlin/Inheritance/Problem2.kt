package Inheritance

/*
Problem 2:
Create a class called Shape with a property name and a method calculateArea().
 The calculateArea() method should return 0.0 by default.

Create two subclasses Circle and Rectangle that inherit from the Shape class.
 Add properties like radius and length and width respectively to the subclasses.

Override the calculateArea() method in both subclasses to return the actual area
 calculation for a circle and rectangle.
 */

open class Shape (val name: String){
   open fun calculateArea(){

    }
}

class Rectangle (name: String,  val l : Int, val b: Int):Shape(name){
    override fun calculateArea() {
        var area  = l * b
        println("The are a of the $name is $area")
    }
}

class Circle (name: String, val pi: Double, val r: Int): Shape(name){
    override fun calculateArea(){
        var area = pi*r*r
        println("The area fo the $name is $area")
    }
}

fun main (){
    var r = Rectangle("rectangle", 12, 14)
    r.calculateArea()

    var c = Circle("circle", 12.0, 4)
    c.calculateArea()

}