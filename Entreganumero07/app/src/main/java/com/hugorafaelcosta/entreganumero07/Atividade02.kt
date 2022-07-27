package com.hugorafaelcosta.entreganumero07

fun main() {
    println(DayOfWeek.MONDAY.dayOfWeek)
    println(DayOfWeek.TUESDAY.dayOfWeek)
    println(DayOfWeek.WEDNESDAY.dayOfWeek)
    println(DayOfWeek.THURSDAY.dayOfWeek)
    println(DayOfWeek.FRIDAY.dayOfWeek)
    println(DayOfWeek.SATURDAY.dayOfWeek)
    println(DayOfWeek.SUNDAY.dayOfWeek)
}

enum class DayOfWeek() {
    MONDAY() {
        override val dayOfWeek = "monday"
    },
    TUESDAY() {
        override val dayOfWeek = "tuesday"
    },
    WEDNESDAY() {
        override val dayOfWeek = "wednesday"
    },
    THURSDAY() {
        override val dayOfWeek = "thursday"
    },
    FRIDAY() {
        override val dayOfWeek = "friday"
    },
    SATURDAY() {
        override val dayOfWeek = "saturday"
    },
    SUNDAY() {
        override val dayOfWeek = "sunday"
    };

    abstract val dayOfWeek: String
}