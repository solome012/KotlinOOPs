package BasicKotlin


class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val lamp = Lamp()

            lamp.turnOff()
            println("Is the lamp on? ${lamp.ison}")

            lamp.turnOn()
            println("Is the lamp on? ${lamp.ison}")
            val r = lamp.addNumber(13.22, 12.22)
            println(r)

        }
    }
}