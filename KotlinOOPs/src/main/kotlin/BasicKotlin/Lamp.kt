package BasicKotlin

public class Lamp {

    //property of the class(data member)
    var ison: Boolean = false

    //member function
    fun turnOn() {
        ison = true
    }
    fun turnOff() {
        ison = false
    }

    fun addNumber(n1: Double, n2:Double):Int { // passing the parameter inside the function
        val sum = n1 +n2
        val sumInteger = sum.toInt()
        return sumInteger
    }
}