package aula.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler as medidas dos lados de dois triangulos X e Y (suponha
        medidas válidas). Em seguida, mostrar o valor das áreas dos dois triangulos e dizer qual
        dos dois triangulos possui a maior area.

        A formula para calcular a area de um triangulo a partir das medidas de seus lados a, b e c
        é a seguinte (formula de Heron).

        area = √p(p-a)(p-b)(p-c)   onde p = (a + b + c) / 2 */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = scanner.nextDouble();
        xB = scanner.nextDouble();
        xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = scanner.nextDouble();
        yB = scanner.nextDouble();
        yC = scanner.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Trianfle X area: %.4f%n", areaX);
        System.out.printf("Trianfle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Langer area: X");
        } else {
            System.out.println("Langer area: Y");
        }
        scanner.close();
    }
}
