package com.hugorafaelcosta.exerciciomodulotres

class ParOuImparComWhen {
}

fun main() {
    val numero = 9

    when{
        numero % 2 == 0 -> println("é par")
        else -> println("é impar")
    }
}