package BasicKotlin

import kotlin.coroutines.coroutineContext

class breakStament {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
        val obj = breakStament()// create the instance of the breakStament class then call it
            obj.test()
            obj.PrintUntil0()
        }
    }
    fun test() {
        for (i in 1..10) {
            if (i==5) {
                break
            }
            println(i)
        }
    }

    // calculate the sum until the users enter 0
    fun PrintUntil0() {
        var sum = 0
        var number: Int

        while (true) {
            print("Enter a number: ")
            number = readLine()!!.toInt()

            if (number == 0)
                break

            sum += number
        }

        println("The sum is $sum")
    }




}






