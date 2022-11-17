package aula.estruturadowhile;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* O bloco de comandos executa pelo menos uma vez, poid a condicao é verificada no final

            true: volta
            false: pula fora */

        /* Fazer um programa para ler  uma temperatura em Celsius e mostrar o equivalente em Fahrenheit.
        Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o programa.
        Fórmula: F = 9 * C / 5 + 32 */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char resposta;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = 9 * celsius / 5 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n) ? ");
            resposta = scanner.next().charAt(0);
        } while ( resposta != 'n');

        scanner.close();

    }
}
