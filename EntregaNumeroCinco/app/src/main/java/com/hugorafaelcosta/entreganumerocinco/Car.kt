package com.hugorafaelcosta.entreganumerocinco

fun main() {
    val car = Car()
//    car.addVelocity()
//    car.lessVelocity()
    car.showActualVelocity()
}

class Car() {
    private var velocity: Long
    private var acceleration: Long
    var model: String


    init {
        this.velocity = 50
        this.acceleration = 10
        this.model = "Gol"
    }

    fun addVelocity(): Long {
        this.velocity += acceleration
        return this.velocity
    }

    fun lessVelocity(): Long {
        velocity -= acceleration
        if (velocity < 0) {
           velocity = 0
        }
        return velocity
    }

    fun showActualVelocity(){
        println(velocity)
    }
}