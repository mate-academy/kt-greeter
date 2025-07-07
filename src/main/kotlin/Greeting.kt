// create a function and implement it
const val NAME = "Bob"

fun main(){
    println(greet(NAME))
}

fun greet(name: String): String{
   return "Hi, ${name}!"
}
