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

// Mengubah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun ContohSet() {
    println("==== Set ====")

    // Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    // Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

    // Menghapus data dari Set Mutable
    shape.remove("Circle")
    println(shape)

    // Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)

    fun ContohMap() {
        println("==== Map ====")

        // Map Read-Only
        val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
        println(readOnlyShape)

        // Map Mutable
        val shape: MutableMap<String, Int> =
            mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
        println(shape)

        // Menambahkan data ke dalam Map Mutable
        shape["Rectangle"] = 4
        println(shape)

        // Menghapus data dari Map Mutable
        shape.remove("Circle")
        println(shape)

        // Mengubah data di dalam Map Mutable
        shape["Square"] = 5
        println(shape)

        // Map Read-Only
        val shapesLocked: Map<String, Int> = shape
        println(shapesLocked)
    }

    fun main() {
        ContohList()
        ContohSet()
        ContohMap()
    }
}