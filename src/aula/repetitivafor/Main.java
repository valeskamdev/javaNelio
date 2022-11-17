package aula.repetitivafor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* usado quando se sabe previamente a quantidade de repeticoes, ou intervalo de valores.
           Ótimo para fazer contagens (progressiva ou regressiva) */


        /* Fazer um programa que lê um valor inteiro N e depois N números inteiros.
        Ao final, mostrar a soma dos N números lidos. */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            soma += x;
        }
        System.out.println(soma);
    }
}
