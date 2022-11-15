package aula;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        /*
            REGRA CONDICIONAL SIMPLES

         true: executa o bloco de comandos
         false:pula bloco de comendos
         */


        // condicional simples
        int x = 5;

        System.out.println("Bom dia!");

        if ( x < 0) {
            System.out.println("Boa tarde!");
        }
        System.out.println("Boa noite!");
        System.out.println("\n");


        /*
            REGRA CONDICIONAL COMPOSTA

         true: executa somente o bloco do if
         false: executa somente o bloco do else
         */


        // condicional composta
        Scanner scanner = new Scanner(System.in);
        int hora;

        System.out.println("Que horas são?");
        hora = scanner.nextInt();

        // encadeamento de estruturas condicionais
        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if ( hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
        scanner.close();
    }
}