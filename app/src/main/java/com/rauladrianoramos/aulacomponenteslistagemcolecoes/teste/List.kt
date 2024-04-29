package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

data class User(
    val nome: String,
    val idade: Int
)

fun main() {

    //posso mudar os valores mais nao posso add ou remover
    val listaArray = arrayOf("Raul","Mary")

    listaArray[1] = "Maryellen"

    listaArray.forEach { item -> println(item) }


    //posso add e remover na lista
    val listaArrayMutavel = mutableListOf("Raul","Mary")
    listaArrayMutavel.add("Adriano")
    listaArrayMutavel.addAll(listOf("Thais", "Francisco","Ramos"))
    listaArrayMutavel.remove("Ramos")
    listaArrayMutavel.removeAt(3)

    listaArrayMutavel.forEach { item -> println(item) }

    val listaUsers = mutableListOf(
        User("Raul", 30),
        User("Mary", 28)
    )

    listaUsers.forEach { user ->
        println("${user.nome} - ${user.idade}")
    }

    listaUsers.clear()

}