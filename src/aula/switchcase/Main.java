package aula.switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semanda
           (sendo 1= domingo, 2= segunda, e assim por diante). Escrever na tela o dia da semana
           correspondente. */

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        String dia;

        // verificando o valor de "x" e então executando o código que está dentro do case que corresponde ao valor de "x"
        switch (x) {
            case 1 -> dia = "Domingo";
            case 2 -> dia = "Segunda";
            case 3 -> dia = "Terca";
            case 4 -> dia = "Quarta";
            case 5 -> dia = "Quinta";
            case 6 -> dia = "Sexta";
            case 7 -> dia = "Sábado";
            default -> dia = "Dia inválido!";
        }
        System.out.println("Dia da semanda: " + dia);
        scanner.next();
    }
}
