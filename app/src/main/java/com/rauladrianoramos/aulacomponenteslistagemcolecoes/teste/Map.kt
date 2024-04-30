package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

fun main() {

    val listaItens = listOf("Raul","Mary")

    val lista = mapOf(
        0 to "Raul",
        1 to "Mary"
    )

    lista.forEach { pessoa ->
        println("${pessoa.key} - ${pessoa.value}")
    }


    val listaMutavel = mutableMapOf(
        0 to "Raul",
        1 to "Mary"
    )

//    listaMutavel.put(2,"Adriano") posso utilizar das 2 maneiras
    listaMutavel[2] = "Adriano"

    listaMutavel.replace(1,"Maryellen")

    listaMutavel.remove(2)

    listaMutavel.forEach { pessoa ->
        println("${pessoa.key} - ${pessoa.value}")
    }
}