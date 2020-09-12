package br.digital.com

class Impressora( ) {
    var listaImprimivel = mutableListOf<Imprimivel>()

    fun adicionar(vararg imprimiveis: Imprimivel) {
        for (imprimivel in imprimiveis)
            listaImprimivel.add(imprimivel)
    }

    fun imprimir() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
    }
}