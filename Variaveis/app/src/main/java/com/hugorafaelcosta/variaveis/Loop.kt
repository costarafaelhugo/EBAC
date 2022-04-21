package com.hugorafaelcosta.variaveis

class Loop {
}

fun main() {
    var array: IntArray = IntArray(20)


    var i = 0
    while (i <= array.size - 1) {
//        println(array[i])
        i++
    }

    for (j in array.indices) {
        array[j] = j * 2
    }
    var result = 0
    for (j in 0..array.size - 1) {
        result += result + array[j] / 3
        println(result)
    }

    var k = 0
    while (k < array.size){
        result += array[k] / 3
    }

}