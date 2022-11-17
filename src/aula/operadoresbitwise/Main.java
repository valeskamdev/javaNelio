package aula.operadoresbitwise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

         &   -->  operacao "E" bit a bit (verdadeiro quando as duas condicoes forem verdadeiras)
         |   -->  operacao "OU" bit a bit (verdadeiro quando pelo menos uma condicao verdadeira e quando as duas sao verdadeiras)
         ^   -->  operacao "OU-exclusivo-XOR" bia a bit  (uma das duas verdadeiras)

         */

        int n1 = 89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int mask = 0b00100000;

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }

        scanner.close();
    }
}
