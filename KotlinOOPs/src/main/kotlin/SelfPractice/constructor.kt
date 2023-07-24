package SelfPractice

class  person (val name: String, var age: Int, val address: String, val salary: Float) {
    fun personDetails() {
        println("The name of the person is $name" )
        println(" His current age is $age")
        println(" He lives in  $address ")
        println("He has salary of  $salary")

    }
}

fun main (){
    val personInfo = person("santosh saud",24, "achham", 0000000f)
    personInfo.personDetails()
}