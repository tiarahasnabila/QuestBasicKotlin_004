package com.example.myapplication

//List adalah Kumpulan data yang disusun secara berurutan dari
//List bersifat ordered, artinya data yang dimasukkan akan memiliki posisi sesuai urutan
//List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
//List Read-Only menggunakan listOf
//List Mutable menggunakan mutableListOf

fun ContohList() {
    println("==== List ====")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Triangle")
    println(shape)


}