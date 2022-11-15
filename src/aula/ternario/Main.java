package aula.ternario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
        scanner.close();

        /*
        MESMA COISA QUE:

        double preco = 34.5;
        double desconto;

        if (preco < 20) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.05;
        }

         */
    }
}
