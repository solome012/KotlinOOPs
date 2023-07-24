package BasicKotlin

// polymorphism is the ability of the object to take on many form


open class Vehicle {
    open fun Drive (){
        println("Driving the vehicle :")
    }
}

class Bus : Vehicle (){
    override fun  Drive (){
        println("Driving the bus..")
    }
}

class bike:  Vehicle(){
    override fun Drive (){
        println("Driving the bike..")
    }
}


fun main() {
val vechObj: Array<Vehicle> = arrayOf(Bus(), bike())
    for (Vechicle in vechObj)
        Vechicle.Drive()
    }
