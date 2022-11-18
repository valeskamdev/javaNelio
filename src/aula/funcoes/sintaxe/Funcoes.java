package aula.funcoes.sintaxe;

import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {

        /* Fazer um programa para ler tres numeros inteiros e mostrar na tela o maior deles*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int higher = max(n1, n2, n3);
        showResult(higher);

        scanner.close();
    }

    public static int max(int x, int y, int z) {
        int aux;

        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value) {
        System.out.println("Higher: " + value);
    }
}
