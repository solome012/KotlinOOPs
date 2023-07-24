package SelfPractice

class Break {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            test2();
            test3()
        }
    }
}

fun test2(){
    for (i in 1..10){
        if (i==5){
            break;
        }
        println(i)
    }
}


fun test3(){
    var sum = 0
    var number: Int

    while (true){
        println("Enter a number :")
        number = readln()!!.toInt()
        if (number ==0) {
            break

        }
        sum += number

    }
    println("The sum is $sum")
}