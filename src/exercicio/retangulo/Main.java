package exercicio.retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler os valores da largura e altura de um retângulo.
           Em seguida, mostrar na tela o valor de sua area, perimetro e diagonal.
           Usar uma classe Retangle. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Retangle retangle = new Retangle();

        System.out.println("Enter rectangle width and height: ");
        retangle.width = scanner.nextDouble();
        retangle.height = scanner.nextDouble();

        System.out.printf("AREA: %.2f%n", retangle.area());
        System.out.printf("PERIMETER: %.2f%n", retangle.perimeter());
        System.out.printf("DIAGONAL: %.2f%n", retangle.diagonal());

        scanner.close();
    }
}