package com.mizz.belajarkotlin.array

//vararg memungkinkan menerima banyak argument dalam 1 variable
fun printAllStrings(vararg strings: String) {
    for (string in strings) {
        print(string)
    }
    println()
}
fun main() {
    //    Array
//    data struktur menyimpan nilai yang menggnakan index untuk mengakses nya, boleh duplicate
    val numbers = arrayOf(1,2,3,4,5)
    println(numbers[0])

    val nullArray: Array<Int?> = arrayOfNulls(3)
    println(nullArray.joinToString())
    nullArray[0] = 1
    println(nullArray.joinToString())

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
     * Note how keys must be unique, so the late st value of "apple"
     * overwrites the first
     */
    println("array to map")
    println(pairArray.toMap())

    /**
     * Nested Arrays
     * arrays can be nested within each other to created multidimensional arrays
     */
//    array 2 dimensi
    val twoDimensiArray = Array(2) {Array<Int>(3) {1} }
    println(twoDimensiArray.contentDeepToString())
}