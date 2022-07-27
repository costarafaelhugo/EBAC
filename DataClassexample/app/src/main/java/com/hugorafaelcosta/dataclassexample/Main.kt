package com.hugorafaelcosta.dataclassexample

fun main() {

    val person = Person("Diego", "11111111111", "diego@test.com")
    person.idade = 30
    val person2 = Person("Larissa", "2222222222", "larissa@test.com")
    println(person.equals(person2))
    println(person)

    val (name, cpf, email) = person
    println(name)
    println(cpf)
    println(email)

}

data class Person(var name: String, val cpf: String, var email: String) {
    var idade: Int = 0
}