package br.digital.com

class Contrato(
        override var nome: String,
        override var tipoDeDocumento: String) : Imprimivel {
        override fun imprimir() = println("$nome sou um $tipoDeDocumento muito legal")
}