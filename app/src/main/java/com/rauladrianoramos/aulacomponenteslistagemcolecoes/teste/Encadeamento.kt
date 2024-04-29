package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

//recriando estrutura Toast
class Mensagem(
    val mensagem : String,
    val duracao: Int
){
    companion object{
        const val DURACAO_CURTA = 0
        const val DURACAO_LONGA = 1

        fun construirTexto(mensagem : String, duracao: Int) : Mensagem{
            return Mensagem(mensagem,duracao)
        }
    }

    fun exibir(){
        println("M: ${this.mensagem} - D: ${this.duracao}")
    }
}

fun main() {
    Mensagem.construirTexto("Ola", Mensagem.DURACAO_LONGA).exibir()
}