package com.mizz.belajarkotlin.flowcontrol

enum class Color {
    RED, GREEN, BLUE, BLACK;
}

fun getColor(): Color {
    val random = (1..3).random()
    return when (random) {
        1-> Color.BLUE
        2 -> Color.RED
        3 -> Color.GREEN
        else -> {
            Color.BLACK
        }
    }
}

fun main() {
    when (getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        Color.BLUE -> println("blue")
        Color.BLACK -> println("black")
    }
}