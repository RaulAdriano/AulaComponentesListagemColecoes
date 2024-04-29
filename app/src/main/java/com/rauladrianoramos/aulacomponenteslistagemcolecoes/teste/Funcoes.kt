package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste

class Matematica{

    //Metodo - está acociado a uma classe
    fun somar(n1: Int, n2:Int) : Int {
        return n1 +n2
    }
}

//função
fun somar(n1: Int, n2:Int) : Int {
    return n1 +n2
}

fun calcular( funcao: (Int,Int) ->Int){

    val retorno = funcao(10,10)
    println(retorno)
}

fun main(){

    //usando metodo da classe matematica
    val matematica = Matematica()
    var retorno = matematica.somar(10,5)
    println(retorno)

    //usando funcao
    retorno = somar(10,8)
    println(retorno)

    //passando função por parametro
    calcular(::somar)

    //passando metodo por parametro
    calcular(matematica::somar)



}