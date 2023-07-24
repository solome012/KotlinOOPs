package Inheritance

import Classes_object.car

/*
Problem 1:
Create a class called Vehicle with properties like color and model.
Add a method drive() that prints "Driving the vehicle".

Create two subclasses Car and Motorcycle that inherit from the Vehicle class.
 Add a property numberOfWheels to each subclass, specific to their type of vehicle.

Override the drive() method in both subclasses to print "Driving the car" for the Car
class and "Riding the motorcycle" for the Motorcycle class.
 */
open class Vehicle1(val color: String, val model: Int) {
    open fun drive() {
        println("Driving the vehicle")
    }
}

class Car : Vehicle1("red", 2012) {
    override fun drive() {
        println("The color of the car is: $color")
        println("The model of the car is: $model")
        println("Number of wheels of the car is: 4")
    }
}

class Motorcycle : Vehicle1("black", 2032) {
    override fun drive() {
        println("The color of the motorcycle is: $color")
        println("The model of the motorcycle is: $model")
        println("Number of wheels of the motorcycle is: 2")
    }
}

fun main() {
    val c = Car()
    c.drive()
    println()

    val m = Motorcycle()
    m.drive()
}