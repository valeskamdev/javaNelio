package aula.membros.estaticos;

import aula.membros.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Fazer um programa para ler um valor numerico qualquer, e dai mostrar quanto seria
           o valor de uma circunferencia e do volume de uma esfera para um raio daquele valor.
           Informar tambem o valor de PI com duas casas decimais. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator.circumferemce(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }
}
