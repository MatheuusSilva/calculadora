fun main() {
    var saldo = 0.0
    var opcao: Int
    
    do {
    println("CAIXA ELETRÔNICO")
    println("1. Depositar")
    println("2. Sacar")
    println("3. Consultar Saldo")
    println("4. Sair")
    print("Escolha uma opção: ")
        
     opcao = readLine()?.toIntOrNull() ?: 4
        
    when (opcao) {
        1 -> {
            print("Digite o valor para depósito: ")
            val valor = readLine()?.toDoubleOrNull() ?: 0.0
            if (valor > 0) {
                saldo += valor
                println("Depósito de R$${"%.2f".format(valor)} realizado com sucesso!")
            } else {
        println("Valor inválido para depósito!")
            }
            }
        2 -> {
            print("Digite o valor para saque: ")
            val valor = readLine()?.toDoubleOrNull() ?: 0.0
        if (valor > 0 && valor <= saldo) {
                 saldo -= valor
                println("Saque de R$${"%.2f".format(valor)} realizado com sucesso!")
          } else if (valor > saldo) {
                println("Saldo insuficiente!")
          } else {
                println("Valor inválido para saque!")
            }
            }
        3 -> {
            println("Seu saldo atual é: R$${"%.2f".format(saldo)}")
            }
        4 -> {
           println("Obrigado por usar nosso caixa eletrônico!")
            }
         else -> {
         println("Opção inválida! Tente novamente.")
          }
        }
    } while (opcao != 4)
}