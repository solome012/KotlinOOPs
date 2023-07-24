package BasicKotlin

class DefaultArgument
{
companion object{
    @JvmStatic
    fun main(args: Array<String>) {
       val obj = DefaultArgument()
        val g= obj.foo('H', 23)
        println(g)
       println(obj.displayBorder(12 , 14))
       displayBorder2('=', 5)
        displayBoreder3()
    }}

    fun foo(Letter: Char = 'a', number:Int= 15){
        println("name = $Letter")
        println("number=$number")

    }

    fun displayBorder(height: Int, lenght:Int){
        val Area = height*lenght
        println("Area of the rectangle is $Area")

    }
}


// Not Named Argument

fun displayBorder2(character: Char = '=', lenght: Int=16){
    for (i in 1..lenght){
        println(character)
    }
}

// kotlin Named argument example
fun displayBoreder3(character: Char='*', lenght: Int= 12){
    for (i in 1..lenght){
        print(character)
    }
}