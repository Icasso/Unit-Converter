package converter

import java.util.*

val scanner = Scanner(System.`in`)
fun main() {
    print("Enter a number of kilometers: ")
    val input = scanner.nextInt()
    println("$input kilometers is " + input * 1000 + " meters")
}
