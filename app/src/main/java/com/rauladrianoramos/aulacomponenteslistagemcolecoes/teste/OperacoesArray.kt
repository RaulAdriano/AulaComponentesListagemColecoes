package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

fun main() {
    val listaInteiro = intArrayOf(1,2,3,4,5,67,8,90,442,12)
    val lista = arrayOf(1,2,"raul","teste", 10, false)
    val listaNomes = arrayOf("Raul","Adriano","Ramos")


    println(listaNomes[2])

    val novalista = listaNomes.plus("Maryellen")

    println(listaNomes.size)
    println(listaNomes.indexOf("Raul"))
    println(listaNomes.first())
    println(listaNomes.last())
    println(listaNomes.contains("Raul"))
    println(listaNomes.contains("Mary"))

    listaNomes.shuffle() //embaralha a lista


    listaNomes.forEach { item ->
        println(item)
    }
}