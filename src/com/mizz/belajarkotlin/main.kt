package com.mizz.belajarkotlin

//vararg memungkinkan menerima banyak argument dalam 1 variable
fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        print(string)
    }
    println()
}

fun main() {
    println("Hello Kotlin!")
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

//    Array
//    data struktur menyimpan nilai yang menggnakan index untuk mengakses nya, boleh duplicate
    val numbers = arrayOf(1,2,3,4,5)
    println(numbers[0])

    val exampleArr = IntArray(5)
//    jika tidak mengisi semua element array maka value default nya 0
    exampleArr[0] = 1

    for (arr in exampleArr) {
        print("$arr,")
    }

    println()

    val stringsOfArray = arrayOf("d","e")
//    spread operator (*)
    printAllStrings("a", "b", "c", *stringsOfArray)

    val simpleArr = arrayOf(1,2,3)
    val anotherArr = arrayOf(1,2,3)

//    membandingkan isi dari array
    println(simpleArr.contentEquals(anotherArr))
//    jangan menggunakan operator equality atau persamaan (==) untuk membandingkan array karena itu akan mengecek apakah itu object yang sama
//    println(simpleArr == anotherArr)

    simpleArr[0] = 10
//    membandingkan setelah isi array diubah
    println(simpleArr.contentEquals(anotherArr))
//    indeces mengembalikan number of index
    for (i in simpleArr.indices) {
        print("${simpleArr[i]} ")

        if (i != simpleArr.size - 1) {
            print("+ ")
        }
    }
    println()
//    10+2+3
    println("total = ${simpleArr.sum()}")


//    shuffle
    println("shuffle adalah mengacak/random element pada array")
    simpleArr.shuffle()
    println(simpleArr.joinToString())

    simpleArr.shuffle()
    println(simpleArr.joinToString())

    println("convert arrays to collections")
    val arr = arrayOf("a", "b", "c", "c")
//    mengubah menjadi Set
    println("array to set")
    println(arr.toSet())
//    mengubah menjadi List
    println("array to list")
    println(arr.toList())
//    mengubah menjadi Mutable List
    println("array to mutable list")
    val arrMutableList = arr.toMutableList()
    arrMutableList.add("d")
    println(arrMutableList)

//    mengubah menjadi Map
//    hanya array pasangan key dan value yang bisa di convert  menjadi tipe data Map
    val pairArray = arrayOf("apple" to 5000, "banana" to 7000, "manggo" to 1000, "guava" to 5000, "apple" to 2000)

    /**
     * Converts to a Map
     * The keys are fruits and the values are their number of calories
     * Note how keys must be unique, so the latest value of "apple"
     * overwrites the first
     */
    println("array to map")
    println(pairArray.toMap())

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

//    Set
//    Set kebalikan dari List, dimana item nya tidak terurut dan item nya unik


}