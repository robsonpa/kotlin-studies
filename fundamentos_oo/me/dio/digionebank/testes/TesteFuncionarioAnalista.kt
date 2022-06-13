package me.dio.digionebank.testes

import me.dio.digionebank.Analista

fun main() {
    val joao = Analista("João Pedro", "1234567899", 2000.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}
