import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

const val SOMA = 1
const val SUBTRACAO = 2
const val MULTIPLICACAO = 3
const val DIVISAO = 4
const val POTENCIACAO = 5
const val RAIZ_QUADRADA = 6
const val FATORIAL = 7
const val PORCENTAGEM = 8
const val RESTO = 9

fun main(args: Array<String>) {
    print("Escolha uma das opções abaixo para realizar seus calculos!!! \n")
    print(
        " 1 - SOMA \n 2 - SUBTRAÇÃO \n 3 - MULTIPLICAÇÃO \n" +
                " 4 - DIVISÃO \n 5 - POTENCIAÇÃO \n 6 - RAIZ QUADRADA \n " +
                "7 - FATORIAL \n 8 - PORCENTAGEM \n 9 - RESTO \n")

    val operation = readLine()?.toInt()

    val readerNumber = Scanner(System.`in`)
    print("Digite dois numeros\n")
    print("Primeiro numero: \n")
    val firstNumber = readerNumber.nextDouble()
    print("Segundo numero: \n")
    val secondNumber = readerNumber.nextDouble()

    while (firstNumber == null || secondNumber == null) {
        print("Algum numero não foi digitado, por favor digite novamente dois numeros\n")
        val firstNumber = readerNumber.nextDouble()
        val secondNumber = readerNumber.nextDouble()
    }
    val result: Double

    when (operation) {
        SOMA -> {
            result = firstNumber + secondNumber
            print("Resultado da soma é: $result")
        }
        SUBTRACAO -> {
            result = firstNumber - secondNumber
            print("Resultado da subtracao é: $result")
        }
        MULTIPLICACAO -> {
            result = firstNumber * secondNumber
            print("Resultado da multiplicação é: $result")
        }
        DIVISAO -> {
            if (secondNumber == 0.0) {
                print("Não existe divisão por zero")
            } else {
                result = firstNumber / secondNumber
                print("Resultado da divisão é: $result")
            }
        }
        POTENCIACAO -> {
            result = firstNumber.pow(secondNumber)
            print("Resultado da potenciação é: $result")
        }
        RAIZ_QUADRADA -> {
            result = sqrt(firstNumber)
            val result2 = sqrt(secondNumber)
            print("As raizes quadradas dos numeros são: $result e $result2 \n")
        }
        FATORIAL -> {
            result = if (firstNumber == 1.0) firstNumber else factorial(firstNumber)
            var result3 = if (secondNumber == 1.0) secondNumber else factorial(secondNumber)
            print("O fatorial dos numeros é: $result e $result3 \n")
        }
        PORCENTAGEM -> {
            print("Digite a porcentagem que deseja calcular: \n")
            var numberPercentage = Scanner(System.`in`)
            var percentage = numberPercentage.nextDouble() / 100
            result = firstNumber * percentage
            var result4 = secondNumber * percentage
            print("A porcentagem dos numeros é: $result e $result4 \n")
        }
        RESTO -> {
            if (secondNumber == 0.0) {
                print("Não existe divisão por zero")
            } else {
                result = firstNumber % secondNumber
                print("O resto da divisao dos numeros e: $result \n")
            }
        }
        else -> println("Digite uma opção valida")
    }
}

fun factorial(a: Double): Double = if (a == 1.0) a else factorial(a - 1) * a

