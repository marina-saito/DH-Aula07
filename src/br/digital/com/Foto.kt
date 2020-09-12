package br.digital.com

class Foto(
        override var nome: String,
        override var tipoDeDocumento: String) : Imprimivel {
        override fun imprimir() {
            println("$nome sou um documento $tipoDeDocumento")
        }
}