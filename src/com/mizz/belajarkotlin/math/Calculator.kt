package com.mizz.belajarkotlin.math

class Calculator {
    fun pertambahan(a: Int, b: Int): Int {
        return a + b
    }

    fun pengurangan(a: Int, b: Int): Int {
        return a - b
    }
    fun perkalian(a: Int, b: Int): Int {
        return a * b
    }
    fun pembagian(a: Int, b: Int): Int {
        return a / b
    }
}

fun main() {

    val calculator = Calculator()

    println("Selamat datang di Calculator sederhana!")

    while (true) {
        println("====== List Operator ======")
        println("1. Pertambahan (+)")
        println("2. Pengurangan (-)")
        println("3. Perkalian (*)")
        println("4. Pembagian (/)")
        println("5. Exit...")

        print("Masukan Pilihan (1-5): ")
        val choice = Integer.valueOf(readlnOrNull())

        when (choice) {
            1 -> {
                print("Masukan Angka Pertama: ")
                val a = Integer.valueOf(readlnOrNull())

                print("Masukan Angka Kedua: ")
                val b = Integer.valueOf(readlnOrNull())

                val result = calculator.pertambahan(a, b)

                println("$a + $b = $result")
            }
            2 -> {
                print("Masukan Angka Pertama: ")
                val a = Integer.valueOf(readlnOrNull())

                print("Masukan Angka Kedua: ")
                val b = Integer.valueOf(readlnOrNull())

                val result = calculator.pengurangan(a, b)

                println("$a - $b = $result")
            }
            3 -> {
                print("Masukan Angka Pertama: ")
                val a = Integer.valueOf(readlnOrNull())

                print("Masukan Angka Kedua: ")
                val b = Integer.valueOf(readlnOrNull())

                val result = calculator.perkalian(a, b)

                println("$a * $b = $result")
            }
            4 -> {
                print("Masukan Angka Pertama: ")
                val a = Integer.valueOf(readlnOrNull())

                print("Masukan Angka Kedua: ")
                val b = Integer.valueOf(readlnOrNull())

                val result = calculator.pembagian(a, b)

                println("$a / $b = $result")
            }
            5 -> {
                break
            }
        }
    }
    print("T_T")
}