package com.hugorafaelcosta.variaveis

class Conditionals {
}

fun main() {
    var numero1  = 5
    var numero2 = 10
    var numero3 = 12

    if (numero1> numero2 && numero1 > numero3){
        println("Maior numero")
    }else if (numero1 > numero2){
        println("maior que numero2 e menor que numero3 ")
    }else if (numero1 > numero3){
        println("maior que numero3 e menor que numero2")
    }else{
        println("menor que todos")
    }

   val result = when{
        numero1 > numero2 && numero1 > numero3 -> ("Maior numero")
        numero2 > numero2 -> ("maior que numero2 e menor que numero3")
        numero3 > numero3 -> ("Maior que numero3 e menor que numero2")
        else -> ("menor de todos")
    }


}