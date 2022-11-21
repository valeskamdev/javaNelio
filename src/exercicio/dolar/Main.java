package exercicio.dolar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Faca um programa para ler s cotacao em dolar, e depois um valor em dolares a ser comprado
        por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelo dolares, consiferando
        ainda que a oessoa terá que pagar 6% de IOF sobre o valor em dolar. Criar uma classe
        CurrencyConverter para ser responsavel pelos calculos. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();

        System.out.println("What is the dollar price?");
        currencyConverter.dollar = scanner.nextDouble();

        System.out.println("How many dollars will be bought?");
        currencyConverter.dollarsBought = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais: %.2f", currencyConverter.dollarCalculation());

        scanner.close();
    }
}
