package exercicio;

import java.util.Scanner;

public class EstruturaCondicional {
    public static void main(String[] args) {

        /* Fazer um programa para ler  um número inteiro, e depois dizer se este
        número é negativo ou não.*/

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Não negativo");
        }


        // Fazer um programa para ler um número inteiro e dizer se este numero é par ou ímpar

        int numero2 = scanner.nextInt();

        if (numero2 % 2 == 0) {
            System.out.println("PAR");
        } else  {
            System.out.println("ÍMPAR");
        }


        /* Leia dois valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "São Múltiplos" ou
        "Não são Múltiplos", indicando se os valores lidos são múltiplos entre sí. ATENCAO: os números
        devem ser digitados em ordem crescente ou decrescente. */

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São Múltiplos");
        } else {
            System.out.println("Não são Múltiplos");
        }


        /* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duracao do jogo,
           sabendo que o mesmo pode comecar em um dia e terminar em outro, tendo uma duracao
           mínima de 1 hora e máxima de 24 horas. */

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();
        int duracao;

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou " + duracao + " hora(s)");


        /* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade
        deste item. A seguir, calcule e mostre o valor da conta a pagar. */

        int codigoItem = scanner.nextInt();
        int quantidade = scanner.nextInt();

        if ( codigoItem == 1) {
            System.out.printf("Total: R$ %.2f", 4.0 * quantidade );
        } else if ( codigoItem == 2) {
            System.out.printf("Total: R$ %.2f", 4.5 * quantidade);
        } else if ( codigoItem == 3) {
            System.out.printf("Total: R$ %.2f", 5.0 * quantidade);
        } else if ( codigoItem == 4) {
            System.out.printf("Total: R$ %.2f", 2.0 * quantidade);
        } else if (codigoItem == 5) {
            System.out.printf("Total: R$ %.2f", 1.5 * quantidade);
        } else {
            System.out.println("Código do item incorreto");
        }


        /* Você deve fazer um prgrama que leia um valor qualquer e apresente uma mensagem dizendo em qual
           dos seguintes intervalos ([0, 25], [25,50], [75,100]) este valor se encontra. Obviamente se o
           valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem "Fora de intervalo". */

        double valor = scanner.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0, 25]");
        } else if (valor <= 50) {
            System.out.println("Intervalo [25, 50]");
        } else if (valor <= 75) {
            System.out.println("Intervalo [50, 75]");
        } else if (valor <= 100) {
            System.out.println("Intervalo [75, 100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        /* Leia dois valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em
           em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto. ou se está sobre um dos
           eixos cartesianos ou na origem (x = y = 0). Se o ponto estiver na origem, escreva a mensagem "Origem".
           Se o ponto estiver sobre um dos eixos escreva "Eixo X" ou "Eixo Y", conforme for a situacao. */

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        int q1;
        int q2;
        int q3;
        int q4;

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else {
            System.out.println("Eixo X");
        }


        /*  Se o salário for R$ 3002,00 a taxa que incide é de 8% apenas sobre R$ 1000,00 pois a faixa de salário
         que fica de R$ 0.00 até R$ 2000,00 é isenta de imposto de Renda. No exemplo fornecido (abaixo), a taxa é
         de 8% sobre R$ 1000,00 + 18% sobre R$ 2,00 o que resulta em R$ 80,36 no total. O valor deve ser impresso
         com duas casas decimais */

        double salario = scanner.nextDouble();
        double imposto;

        if (salario <= 2000) {
            imposto = 0;
        } else if (salario <= 3000) {
            imposto = (salario - 2000) * 0.08;
        } else if (salario <= 4500) {
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f", imposto);
        }
        scanner.close();
    }
}
