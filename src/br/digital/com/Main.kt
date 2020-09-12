package br.digital.com

fun main() {
    val doc = Documento("Wordinho","Word")
    val foto = Foto("Fotinho", "Selfie")
    val contrato = Contrato("Contratinho", "Contrato")
    val impressora = Impressora()

    impressora.adicionar(doc, foto, contrato, impressora.imprimir())

}