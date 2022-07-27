package com.hugorafaelcosta.entreganumero07

fun main() {
    println(UtilityHelper.isWeekEnd())

    //Atividade 04
    UtilityHelper.setCurrentDay(DayWeek.MONDAY)
    println(UtilityHelper.isWeekEnd())
    UtilityHelper.setCurrentDay(DayWeek.SUNDAY)
    println(UtilityHelper.isWeekEnd())
}


object UtilityHelper {
    private var currentDay: DayWeek = DayWeek.SUNDAY

    init {
        setCurrentDay(DayWeek.SUNDAY)
    }

    fun setCurrentDay(actualDay: DayWeek) {
        this.currentDay = actualDay
    }

    fun isWeekEnd(): Boolean {
        return if (currentDay == DayWeek.SATURDAY || currentDay == DayWeek.SUNDAY) {
            return true
        } else false
    }

}

enum class DayWeek() {
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