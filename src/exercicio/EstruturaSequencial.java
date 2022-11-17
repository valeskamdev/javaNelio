package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencial {
    public static void main(String[] args) {

        /* Faca uma programa para ler dois valores inteiros, e depois mostrar na tela a soma
        desses números com uma mensagem explicativa. */

        Scanner scanner = new Scanner(System.in);

        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;

        System.out.println("SOMA = " + soma);


        /* faca um programa para ler o valor so raio de um círculo, e depois mostrar
         o valor da área deste  círculo com quatro casas decimais */

        Locale.setDefault(Locale.US);
        double raio = scanner.nextDouble();
        double valorDePi = 3.14159;
        double formula = valorDePi * Math.pow(raio, 2);

        System.out.printf("AREA = %.4f", formula);


        /* Fazer um programa para ler quatro valores interiros A, B, C. A seguir, calcule e mostre
        a diferenca do produto de A e B pelo produto de C e D segundo a formula: DIFERENCA = (A * B - C * D) */

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int diferenca = a * b - c * d;

        System.out.println("DIFERENCA = " + diferenca);


        /* Fazer um programa que leia o número de um funcionario, seu numero de horas trablhadas,
         o valor que recebe por hora e calcula o sálario desse funcionario. A seguir mostre o número
         e o sálario do funcionario, com duas casas decimais. */

        Locale.setDefault(Locale.US);
        int funcionario = scanner.nextInt();
        double horasTrabalhadas = scanner.nextDouble();
        double valorHora = scanner.nextDouble();
        double salario = horasTrabalhadas * valorHora;

        System.out.println("Numero de funcionarios: " + funcionario);
        System.out.printf("Salario: U$ %.2f", salario);


        /* Fazer um programa para ler o código de uma peca 1, o número de pecas 1, o valor unitario
        de cada peca 1, o código de uma peca 2 , o numero de pecas 2 e o valor unitario de cada peca.
        Calcule e mostre o valor a ser pago */

        int codigoPeca1 = scanner.nextInt();
        int numeroPeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int numeroPeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double valorTotal = valorPeca1 * numeroPeca1 + valorPeca2 * numeroPeca2;

        System.out.printf("Valor a pagar: R$ %.2f", valorTotal);


        /* Faca um programa que leia tres valores com ponto flutuante de dupla precisao: X, Y e Z.
           Em seguida, calcule e mostre:
           a) a area do triangulo retangulo que tem X por base e Z por altura
           b) a area do circulo de raio Z. (pi = 3.14159)
           c) a area do trapezio que tem X e Y por bases e Z por altura
           d) a area do quadrado que tem lado Y
           e) a area do retangulo que tem aldos X e Y */

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        double triangulo = x * z / 2;
        double circulo = 3.14159 * Math.pow(z, 2);
        double trapezio = (x + y) * z / 2;
        double quadrado = Math.pow(y, 2);
        double retangulo = x * y;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        scanner.close();
    }
}
