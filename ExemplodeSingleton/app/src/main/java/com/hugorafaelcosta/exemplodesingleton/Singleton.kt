package com.hugorafaelcosta.exemplodesingleton

fun main() {
    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SUMMER)
    SchedulerHandler.currentSeason()

    val otherClass =OtherClasse()
    SchedulerHandler.currentSeason()
    SchedulerHandler.setSeason(Season.SPRING)
    otherClass.printCurrentSeason()
}

class OtherClasse(){
    init {
        SchedulerHandler.setSeason(Season.FALL)
    }

    fun printCurrentSeason() = SchedulerHandler.currentSeason()
}

object SchedulerHandler{
    private var season:Season = Season.WINTER

    fun setSeason(newSeason: Season){
        this.season = newSeason
    }

    fun currentSeason() = println(season)
}

enum class Season(val translate: String){
    WINTER("Inverno"),
    SPRING("Primavera"),
    SUMMER("Verão"),
    FALL("Outono")
}