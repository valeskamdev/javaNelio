package aula.vetor;

import aula.vetor.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler um numero inteiro N e a altura de N pessoas. Armazene
         as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            vect[i] = scanner.nextDouble();
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;
        System.out.println("------------------------");


        /* Fazer um programa para ler um numero inteiro N e os dados (nome e preco) de N produtos.
           Armazene os N produtos em um vetor. Em seguida, mostrar o preco medio dos produtos */

        int numero = scanner.nextInt();
        Product[] vetor = new Product[numero];

        for (int i = 0; i < vetor.length; i++) {
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vetor[i] = new Product(name, price);
        }

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i].getPrice();
        }

        double average = soma / vetor.length;
        System.out.printf("Average price: %.2f%n", average);

        scanner.close();
    }
}
