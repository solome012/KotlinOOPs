package BasicKotlin

class Student(val name: String, val adress: String, val age: Int, val grade:Float){
    fun StudentDetail(){
        println("Name of the student is:  $name")
        println("The adress of the student: $adress")
        println("The age of the student: $age")
        println("The grade of the student: $grade")

    }
}

fun main() {
    val stdInfo = Student("Kapil saud", "tikathali" , 13, 5f)
    stdInfo.StudentDetail()
}