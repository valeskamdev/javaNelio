package aula.application;

import aula.entities.Triangle;
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

        // declarando duas variáveis do tipo Triangle
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        // leitura de dados que armazenam em cada um dos atributos dos objetos x e y
        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        // chamada de método, calculando cada area dos traingulos
        double areaX = x.area();
        double areaY = y.area();

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
