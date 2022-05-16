package com.hugorafaelcosta.entregaModuloQuatro

import kotlin.reflect.KFunction2

class Operations {
}

fun main() {
    sum(5, 4)
    mutiply(2, 5)

    //Teste esta (calculadora) função passando dois inteiros e a função soma
    calculadora(5, 2, ::sum)
    calculadora(5, 2, ::mutiply)

    //imprime os numeros pares da lista filtrada
    filteredEvenList()

    //imprime Olá + nome
    olaPessoa()

}

//Crie uma função que receba dois números inteiro de
//parâmetro e retorne o resultado da soma
fun sum(numeroA: Int, numeroB: Int) {
    println(numeroA.plus(numeroB))
}

//Crie uma função compacta que receba dois números inteiros
//de parâmetro e retorne o resultado da multiplicação deles
fun mutiply(numeroA: Int, numeroB: Int) = println(numeroA * numeroB)

//Crie uma função calculadora que recebe
//dois inteiros de parâmetro e um terceiro parâmetro do
//tipo função. Esta função de parâmetro deve receber dois
//inteiros de parâmetro e retornar um inteiro
fun calculadora(numeroA: Int, numeroB: Int, operation: KFunction2<Int, Int, Unit>) {
    operation(numeroA, numeroB)
}

//Crie uma lista com os números inteiro de 1 a 99
val listOfNumbers = listOf(
    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
    20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36,
    37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53,
    54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
    71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
    88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99
)

//Utilizando esta lista crie um filtro que retorna uma lista
//com os números pares contidos na lista original
fun filteredEvenList() {
    println(listOfNumbers.filter { it % 2 == 0 })
}

//Crie uma lista de string com 4 nomes
val listOfNames = listOf("Hugo", "Nina", "Danusa", "Ana")
//Utilizando o operador map concatene a string "Olá "
//antes de cada nome
fun olaPessoa() {
    val modifiedList = listOfNames.map { "Olá $it" }
    println(modifiedList)

    //Percorra a lista modificada usando um forEach e imprima
    //todos os seus valores
    modifiedList.forEach{ println(it)}
}







