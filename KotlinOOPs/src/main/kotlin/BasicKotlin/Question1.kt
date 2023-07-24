package BasicKotlin

/*Create a base class called Shape with properties area and perimeter, along with a method
calculateArea(). Create two subclasses, Circle and Rectangle, that inherit from Shape.
 Override the calculateArea() method in each subclass to calculate and set the appropriate
  values for area and perimeter. Create instances of both subclasses
  and print their area and perimeter values.
 */

open class Shape {
    var area: Double = 0.0
    var perimeter: Double = 0.0

    open fun calculateArea() {
        println("Calculating area of the shape...")
    }
}

class Circle(val radius: Int) : Shape() {
    override fun calculateArea() {
        area = Math.PI * radius * radius
        perimeter = 2 * Math.PI * radius
        println("Circle - Area: $area, Perimeter: $perimeter")
    }
}

class Rectangle(val width: Int, val length: Int) : Shape() {
    override fun calculateArea() {
        area = (width * length).toDouble()
        perimeter = (2 * (width + length)).toDouble()
        println("Rectangle - Area: $area, Perimeter: $perimeter")
    }
}

fun main() {
    val circle: Shape = Circle(4)
    circle.calculateArea()

    val rectangle: Shape = Rectangle(10, 12)
    rectangle.calculateArea()
}
