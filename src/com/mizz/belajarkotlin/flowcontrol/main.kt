package com.mizz.belajarkotlin.flowcontrol

fun main() {
    val a = 5
    val b = 10

    var max = a

    if (a < b) max = b

//    with else
    if (a > b) {
        max = a
    } else {
        max = b
    }

//    as expression
    max = if (a > b) a else b



    println("Max is $max")

//    Branches of an if expression can be blocks. In this case, the last expression is the value of a block:
    max = if (a > b) {
        println("a is max than b")
        a
    } else {
        println("b is max than a")
        b
    }

    print("Enter a random number sir: ")
    val x = Integer.valueOf(readlnOrNull())

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> print("x is neither 1 nor 2")
    }
}