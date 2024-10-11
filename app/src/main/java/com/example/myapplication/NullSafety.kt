package com.example.myapplication

fun nullSafety() {
// neverNull has String type
    var neverNull: String = "This can't be null"

// Throws a compiler error
// neverNull = null

// nullable has nullable String type
    var nullable: String? = "You can keep a null her e"
// This is OK
    nullable = null

// Check for null in conditions
    if (neverNull == null) {
        println("inferred NonNull is null")
    } else {
        println("inferred NonNull is not null")
    }

// Safe call operator
    println(neverNull.length) // 18
    println(nullable?.length) // null

// notNull doesn't accept null values
    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength (neverNull)) // 18
}

fun main() {
    nullSafety()
}