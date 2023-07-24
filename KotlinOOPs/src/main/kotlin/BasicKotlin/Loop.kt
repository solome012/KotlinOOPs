package BasicKotlin

fun main() {
   Print2()
    Print3()
 }




fun Print2 () {
    println("Result of the print 2")
    //The for loop is declared using the downTo keyword, which means the loop will iterate in
    // a descending order from 5 to 1.
    for (i in 5 downTo 1){
        println(i)

    }
}

fun Print3() {
    println("Result of the print3")

    // the loop should iterate by 2 at the each iteration
    // the step keyword is used for increment or decrement
    //for (i in 10 downTo 1 step 2) println(i) // Decrement
    for (i in 1..10 step 1) {
        println(i)
    }

}


