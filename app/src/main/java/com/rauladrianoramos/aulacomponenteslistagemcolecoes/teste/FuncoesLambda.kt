package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

//funcao comum
fun executar(){
    println("Executar")
}

//funcao inline
fun executar2() = println("Executar")

fun main(){


    //funcao lambda
    val funcaoLambda = { nome: String, idade: Int ->
        println("executar -> nome: $nome, idade: $idade")
    }

    funcaoLambda("Raul", 30)

    println("-----------------------------------")

    val botao = Botao()

    //chamando funcao - comum
    botao.configurarCliqueBotao(::executarClique)

    //lambda
    botao.configurarCliqueBotao {
        println("Executou funcao Lambda!")
    }
}


class Botao(){
    fun configurarCliqueBotao(funcao: () -> Unit){  //Unit é uma função sem retorno igual void no Java
       funcao()
    }
}

fun executarClique(){
    println("Executar clique no botão - funcao comum")
}