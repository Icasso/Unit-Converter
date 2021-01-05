package converter

import java.util.*

val scanner = Scanner(System.`in`)
fun main() {
    print("Enter a number and a measure of length: ")
    val number = scanner.nextDouble()
    var unit = scanner.next()
    unit = unit.toLowerCase()
    Convert(number, unit)
}

fun Convert(number: Double, unit: String) {
    var result = 0.0
    when (unit) {
        "m", "meter", "meters" -> {
            result = number * 1
            if (result == 1.0 && number == 1.0) {
                println("$number meter is $result meter")
            } else if (result == 1.0) {
                println("$number meters is $result meter")
            } else if (number == 1.0) {
                println("$number meter is $result meters")
            } else {
                println("$number meters is $result meters")
            }
        }
        "km", "kilometer", "kilometers" -> {
            result = number * 1000
            if (result == 1.0 && number == 1.0) {
                println("$number kilometer is $result meter")
            } else if (result == 1.0) {
                println("$number kilometers is $result meter")
            } else if (number == 1.0) {
                println("$number kilometer is $result meters")
            } else {
                println("$number kilometers is $result meters")
            }
        }
        "cm", "centimeter", "centimeters" -> {
            result = number * 0.01
            if (result == 1.0 && number == 1.0) {
                println("$number centimeter is $result meter")
            } else if (result == 1.0) {
                println("$number centimeters is $result meter")
            } else if (number == 1.0) {
                println("$number centimeter is $result meters")
            } else {
                println("$number centimeters is $result meters")
            }
        }
        "mm", "millimeter", "millimeters" -> {
            result = number * 0.001
            if (result == 1.0 && number == 1.0) {
                println("$number millimeter is $result meter")
            } else if (result == 1.0) {
                println("$number millimeters is $result meter")
            } else if (number == 1.0) {
                println("$number millimeter is $result meters")
            } else {
                println("$number millimeters is $result meters")
            }
        }
        "mi", "mile", "miles" -> {
            result = number * 1609.35
            if (result == 1.0 && number == 1.0) {
                println("$number mile is $result meter")
            } else if (result == 1.0) {
                println("$number miles is $result meter")
            } else if (number == 1.0) {
                println("$number mile is $result meters")
            } else {
                println("$number miles is $result meters")
            }
        }
        "yd", "yard", "yards" -> {
            result = number * 0.9144
            if (result == 1.0 && number == 1.0) {
                println("$number yard is $result meter")
            } else if (result == 1.0) {
                println("$number yards is $result meter")
            } else if (number == 1.0) {
                println("$number yard is $result meters")
            } else {
                println("$number yards is $result meters")
            }
        }
        "ft", "foot", "feet" -> {
            result = number * 0.3048
            if (result == 1.0 && number == 1.0) {
                println("$number foot is $result meter")
            } else if (result == 1.0) {
                println("$number feet is $result meter")
            } else if (number == 1.0) {
                println("$number foot is $result meters")
            } else {
                println("$number feet is $result meters")
            }
        }
        "in", "inch", "inches" -> {
            result = number * 0.0254
            if (result == 1.0 && number == 1.0) {
                println("$number inch is $result meter")
            } else if (result == 1.0) {
                println("$number inches is $result meter")
            } else if (number == 1.0) {
                println("$number inch is $result meters")
            } else {
                println("$number inches is $result meters")
            }
        }
        else -> println("")
    }
}