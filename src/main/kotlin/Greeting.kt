import java.sql.DriverManager.println

fun main() {
    var greet = greet("JOhn")
    println(greet)
}

fun greet(name: String): String {
    return "Hi, ${name}!"
}
