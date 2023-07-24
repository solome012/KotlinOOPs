package Classes_object

fun main() {
    val mustang = car("mustang", "petrol", 35)
    val beetle  =car ("beetle", "diseal", 45)
    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)

}


class car (val name: String, val type : String, var kmRan: Int){
    fun DriveCar(){
        println("$name The car is driving ")
    }
    fun applybreak(){
        println("The Break is applied ")
    }
}