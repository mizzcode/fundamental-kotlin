package com.mizz.belajarkotlin.list

fun main() {
    /**
     * List
     * List mirip array untuk menyimpan item yang terurut dan item nya boleh duplicate, bedanya List itu bisa dynamic untuk size nya
     * dibandingkan dengan array yang ukuran nya tetap/fixed setelah array dibuat dan List itu ada 2 macam:
     * yang pertama immutable yang element tidak bisa diubah dan mutable yang element nya masih bisa berubah ubah
     */

//    List tidak bisa diubah item nya
    val listDrink: List<String> = listOf("Anggur", "Anggur", "Fanta", "Coca-Cola")
//    List yang boleh diubah item nya disebut mutable
    val listFood: MutableList<String> = mutableListOf("Bakso", "Mie Ayam", "Soto Ayam")

    listFood.add("Mie Ayam Bakso")
    listFood.add("Kopi Indocafe")

    var counter = 1

    println("List Minuman :")

    for (drink in listDrink) {
        println("${counter}. $drink")
        counter++
    }

    println("==================")

    var counter2 = 1

    println("List Makanan :")

    for (food in listFood) {
        println("${counter2}. $food")
        counter2++
    }

    listFood.remove("Kopi Indocafe")
//    yang tadi nya mutable menjadi immutable artinya sekarang listFood sudah tidak bisa diubah lagi item nya
//    dinamakan "casting" berubah type nya
    val listFoodLocked: List<String> = listFood

    println("==================")

    var counter3 = 1

    println("List Makanan :")
    for (food in listFoodLocked) {
        println("${counter3}. $food")
        counter3++
    }

    println("Mizz beli ${listFood.first()} seharga 6000")
//    mengecek apakah bakso ada di listFood
    println("Bakso" in listFood)

    println("================")

    for (i in 6 downTo 0 step 2) {
        println(i)
    }

    println("================")
//    indeces mengembalikan number of index
    for (i in listFoodLocked.indices) {
        println("${i+1}. ${listFoodLocked[i]}")
    }
}