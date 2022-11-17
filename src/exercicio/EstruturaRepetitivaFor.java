package exercicio;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
    public static void main(String[] args) {

        /* Leia um valor inteiro.Em seguida mostre os ímpares de 1 até X, um valor por linha. */

        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        for (int i = 1; i < numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


         /* Leia um valor inteiro N. Este valor será a quantidade de valores X que serão lidos em seguida.
           Mostre quantos destes valores X estão dentro do intervalo [10, 20] e quantos estão fora do
           intervalo, mostrando essas informacoes conforme exemplo (use a palavra "in" para dentro do
           intervalo, e "out" para fora do intervalo).*/

        int n = scanner.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();

            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");


         /*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada
        caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a
        média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2,
        e o segundo valor tem peso 3 e o terceiro valor tem peso 5.*/

        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {

            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();

            double media = (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10;
            System.out.printf("%.1f%n", media);
        }


         /*Fazer um programa para ler um nmero N. Depois leia N pares de numeros e mostre a divisao
        do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisão impossivel" */

        int contador = scanner.nextInt();

        for (int i = 0; i < contador; i++) {

            double numero1 = scanner.nextDouble();
            double numero2 = scanner.nextDouble();

            double divisao = numero1 / numero2;

            if (numero2 != 0) {
                System.out.printf("%.1f", divisao);
            } else {
                System.out.println("Divisão impossível");
            }
        }


        /* Ler valor N. Clacular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) *.. * 1.
           Lembrando que, por definicao, fatorial de 0 é 1.*/

        int numero3 = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero3; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);


        /* Ler numero inteiro N e calcular todos os seus divisores */

        int numero4 = scanner.nextInt();

        for (int i = 1; i <= numero4; i++) {

            if (numero4 % i == 0) {
                System.out.println(i);
            }
        }


        /* Fazer um programa para ler um numero inteiro positio N. O programa deve entao mostrar
        na tela N linhas, comecando de 1 até N. Para cada linha, mostrar o numero da linha, depois
        o quadrado e o cubo do valor */

        int numero5 = scanner.nextInt();
        int quadrado;
        int cubo;

        for (int i = 1; i <= numero5; i++) {
            quadrado = i * i;
            cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);
        }
        scanner.close();
    }
}
