package com.hugorafaelcosta.exerciciomodulotres

class IterandoSobreUmaLista {
}

fun main() {
    var list: List<Int> = listOf()
    var soma = 0

    for (i in 1 until 100) {
        soma += i
        println(soma)
    }
}