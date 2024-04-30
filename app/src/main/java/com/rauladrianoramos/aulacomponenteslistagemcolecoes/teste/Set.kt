package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

data class Carro(
    val nome: String,
    val marca: String
)

fun main() {

    val lista = setOf("Raul","Mary", Carro("Civic","Honda"))

    println(lista.indexOf("Raul"))

    lista.forEach{ nome ->
        println(nome)
    }


    println("\n\n--------Familia--------------")

    val listaMutavel = mutableSetOf("Raul","Mary")

    listaMutavel.add("Amora")
    listaMutavel.add("Luna")
    listaMutavel.add("Rato")
    listaMutavel.remove("Rato")

    listaMutavel.forEach{ nome ->
        println(nome)
    }

    println("------------------------------")
}