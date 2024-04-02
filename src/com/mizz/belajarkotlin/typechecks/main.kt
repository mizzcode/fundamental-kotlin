package com.mizz.belajarkotlin.typechecks

fun demo(x: Any) {
//    if (x !is String) {
//        println("Not a String")
//    } else {
//        println("Item number $x")
//    }

    when (x) {
        is Int -> println(x + 1)
        is String -> println(x.length)
        is IntArray -> println(x.sum())
    }
}

fun main() {
    demo(1)
    demo("Mizz")
    demo(intArrayOf(1, 2, 3, 4, 5, 6))
}