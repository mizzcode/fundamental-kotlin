package com.mizz.belajarkotlin
fun main() {
    println("Hello Kotlin!")

    val indo = SayHello();
    indo.halo("Mizz")

//    val itu type variable yang tidak bisa diubah nilai nya
//    8 bit
    val x: Byte = 127
    val y: Byte = -128

//    16 bit
    val a: Short = 32767
    val b: Short = -32768
    val golonganDarah: Char = 'A'

//    32 bit
    val c: Int = 2147483647
    val d: Int = -2147483648
    val suhu: Float = 3.14f
    val f1: Float = 234.5f

//    64 bit
    val e: Long = 9223372036854775807
    val f: Long = -9223372036854775807
    val pi: Double = 3.14
    val r: Double = 21.0

//    true or false boolean
    val yes: Boolean = true
    val no: Boolean = false


    val popcorn = 5     // 5 box popcorn
    val hotdog = 7      // 7 box hotdog

    val pricePopcorn = 5000 * popcorn
    val priceHotdog = 15000 * hotdog

    val nameCustomer = "Mizz"

    println("Pembeli $nameCustomer membeli popcorn sebanyak $popcorn total harga = $pricePopcorn dan hotdog sebanyak $hotdog total harga = $priceHotdog")

    val str: String = "mizz"

    for (c in str) {
        println(c)
    }

//    concatenate string
    val cs = "lostsaga" + 2015
    println(cs + " jaman warnet")
}