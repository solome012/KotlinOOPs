package Polymorphism

/*
 Runtime (or Dynamic) Polymorphism:
 Also known as method overriding or dynamic binding.
 Occurs when the decision about which method to call is
  made during runtime, based on the actual type of the object.
 */


open class Country {
    open fun nepal (){
        println("Nepal is the beautiful country")
    }
}

class Asia: Country(){
    override fun nepal (){
        println(" Nepal is a beautiful country, which lies in south asia")
    }

    fun india (){
        println(" India is the nighbour country of  nepal")
    }
}

fun main (){
    val country= Country() // for the country class
    val country1: Country= Asia() // for the overridin function
    val country2 = Asia()

    country.nepal()
    country1.nepal()
    country2.india()



}