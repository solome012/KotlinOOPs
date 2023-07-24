package SelfPractice

class gettersetter {

private var name : String = " "
    // getter
    fun getname ():String{
        return  name

    }
    // setter
    fun setName(newName: String ){
        name = newName
    }
}


fun main (){
    val obj = gettersetter()
    obj.setName("santosh")
    val name = obj.getname()
    println(name)

}