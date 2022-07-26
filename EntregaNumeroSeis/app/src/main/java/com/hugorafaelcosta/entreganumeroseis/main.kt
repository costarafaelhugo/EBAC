package com.hugorafaelcosta.entreganumeroseis


fun main() {
    val factory = VeiculoFactory()
    val veiculoList: MutableList<Veiculo> = mutableListOf()

    for (i in 0..1) {
        val veiculo = factory.createVeiculo(i % 2, i)
        veiculoList.add(veiculo)
    }

    veiculoList.forEach { veiculo ->
        veiculo.aceleracao()
        println(veiculo)
    }
}


class VeiculoFactory {

    fun createVeiculo(type: Int, id: Int): Veiculo {
        return when (type) {
            1 -> Carro(id)
            else -> Moto(id)
        }
    }
}

abstract class Veiculo(val id: Int) {


    abstract var velocidade: Long

    abstract fun aceleracao()

}

class Carro(id: Int) : Veiculo(id) {
    override var velocidade = 0L

    override fun aceleracao() {
        this.velocidade += 40
    }


    override fun toString() = "Eu sou um carro e minha velocidade é de $velocidade"

}

class Moto(id: Int) : Veiculo(id) {
    override var velocidade = 0L

    override fun aceleracao() {
        this.velocidade += 20
    }

    override fun toString() = "Eu sou uma moto e minha velocidade é de $velocidade"

}
