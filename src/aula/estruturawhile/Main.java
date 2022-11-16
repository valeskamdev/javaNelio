package aula.estruturawhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* recomendada quando nao se sabe previamente a quantidade de repeticoes

           true: executa e volta
           falsae: pula fora */

        /* Fazer um programa que lê números inteiros até que o zero seja lido.
           Ao final mostrar a soma dos números lidos. */

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt(); // leitura do primeiro valor
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = scanner.nextInt();
        }

        System.out.println(soma);
        scanner.close();
    }
}
