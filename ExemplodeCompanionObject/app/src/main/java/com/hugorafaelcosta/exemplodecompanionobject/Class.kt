package com.hugorafaelcosta.exemplodecompanionobject

fun main() {
    val person = Person.Manager.createPerson()
    person.name = "Vitória"
    println(Person.counter)
    person.helloPerson()

    Person.Manager.decrementCounter()
    println(Person.counter)

    val string = "José"
    println(string.myConcat())
}

fun String.myConcat(): String{
    return "Olá $this"
}

fun Person.helloPerson(){
    println("Olá ${this.name}")
}

fun Person.Manager.decrementCounter(){
    counter--
}

class Person private constructor() {
    var name = ""
    var email = ""

    fun getTotalPerson():Int = counter

    companion object Manager {
        var counter = 0

        fun createPerson(): Person {
            counter++
            return Person()
        }
    }
}