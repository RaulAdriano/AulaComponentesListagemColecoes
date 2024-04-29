package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

class Motorista(val nome: String){

    fun exibirDadosMotorista() = println("Motorista: $nome")

    class Caminhao(val nomeCaminhao: String){ //classe aninhada - Nested Class
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao")
    }

    inner class CaminhaoInner(val nomeCaminhao: String){ //classe interna - Inner Class
        fun exibirDadosCaminhao() = println("Caminhao: $nomeCaminhao - motorista: $nome")
    }
}

fun main() {
    val motorista = Motorista("Raul")
    motorista.exibirDadosMotorista()

    val caminhao = Motorista.Caminhao("Optimus Prime")
    caminhao.exibirDadosCaminhao()

   val caminhaoInner = motorista.CaminhaoInner("Caminhao do Ovo")
    caminhaoInner.exibirDadosCaminhao()

    println("---------------------------------------------------")

    val pergunta1 = Pergunta("Qual a pergunta?", 1)
    val pergunta2 = Pergunta("Qual a pergunta?", 1)

    println(pergunta1)
    println(pergunta2)
    println(pergunta1 == pergunta2)
}


data class Pergunta(val pergunta: String, val respostaCerta: Int){

}