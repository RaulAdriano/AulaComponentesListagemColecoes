package com.rauladrianoramos.aulacomponenteslistagemcolecoes.teste
//get e set criados automaticamente
//class Usuario(var nome: String, var idade: Int){}

class Usuario(){
    var nome: String = ""
        //get e setter persolanizados
        get() {
            println("Get: $field")
            return field.uppercase()
        }
        set(value) {
            field = value.uppercase()
            println("Set: $field")
        }

    var idade: Int = 0
    val maiorIdade
        get() = idade >= 18
}
fun main() {

    val usuario = Usuario()
    usuario.nome = "Adriano"
    usuario.idade = 31

    println("Nome: ${usuario.nome} - idade: ${usuario.idade} - Maior idade? ${usuario.maiorIdade}")
}