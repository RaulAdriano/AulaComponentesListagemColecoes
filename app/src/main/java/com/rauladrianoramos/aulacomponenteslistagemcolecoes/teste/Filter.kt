package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

fun main() {

    val listaFrutas = listOf("maça","laranja","banana")

    val listaVendas = listOf(100,500,600,70,1500,800)

    val novaLista = listaFrutas.filter { fruta ->
        fruta == "laranja"
    }

    println(novaLista)

    val novaListaVendas = listaVendas.filter { valor ->
        valor >= 600
    }

    val novaListaVendas2 = listaVendas.filter{it >= 500}

    println(novaListaVendas)
    println(novaListaVendas2)


    val listaNomes = listOf("Raul","Mary","Adriano","Bonini")

    val novaListaNome = listaNomes.filter { nome->
        nome.contains("a")
    }

    println(novaListaNome)

}