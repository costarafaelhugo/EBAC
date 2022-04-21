package com.hugorafaelcosta.variaveis

class NullSafety {
}

fun main() {
    var texto: String? = "Meu texto"
    var tamanho: Int? = texto?.length
}