package aula.comentarios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* comentario em bloco*/
        // comentario em linha

        /* Este programa calcula as raízes de uma equacao do segundo grau
           Os valores dos ecoeficientes devem ser digitados um por linha */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a, b, c, delta;

        System.out.println("Digite os valores dos coeficientes:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        delta = b * b - 4 * a * c;  // calculo do valor de delta
    }
}
