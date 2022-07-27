package com.hugorafaelcosta.entreganumero07

fun main() {
    val word = "casa"
    println(word.stringList())
}

fun String.stringList(): List<Char> {
    return this.toList()
}