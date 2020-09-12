package br.digital.com

class Impressora( ) {
    var listaImprimivel = mutableListOf<Imprimivel>()

    inline fun adicionar(vararg imprimiveis: Imprimivel, imprimir:() -> Unit) {
        for (imprimivel in imprimiveis)
            listaImprimivel.add(imprimivel)
    }

    fun imprimir() {
        for (imprimivel in listaImprimivel) {
            imprimivel.imprimir()
        }
    }
}