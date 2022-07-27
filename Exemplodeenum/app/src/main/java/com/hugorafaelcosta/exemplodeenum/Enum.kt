package com.hugorafaelcosta.exemplodeenum

fun main() {
    var season: Season = Season.FALL
    season = Season.WINTER
    season.hello()

when(season){
    Season.WINTER -> println("É inverno")
    Season.SPRING -> println("É primavera")
    Season.FALL -> println("É outono")
    Season.SUMMER -> println("É verão")
}
}

enum class Season(val translate: String) {
    WINTER("Inverno") {
        override fun hello() = println("Olá inverno")
    },
    SPRING("Primavera") {
        override fun hello() = println("Olá primavera")
    },
    SUMMER("Verão") {
        override fun hello() = println("Olá verão")
    },
    FALL("Outono") {
        override fun hello() = println("Olá outono")
    };

    abstract fun hello()
}