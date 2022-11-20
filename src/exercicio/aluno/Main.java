package exercicio.aluno;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler o nome de um aluno e as tres nostas que ele obteve nos tres
           trimestres do ano(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final,
           mostrar qual a nota final do aluno no ano. Dizer tambem se o aluno esta aprovado (PASS) ou nao
           (FAILED) e, em caso negativo, quantos pontos  faltam para o aluno obter o minimo para ser
           aprovado (que é 60% da nota). Voce deve criar uma classe Student para resolver este problema. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        student.name = scanner.nextLine();
        student.grade1 = scanner.nextDouble();
        student.grade2 = scanner.nextDouble();
        student.grade3 = scanner.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());

        if ( student.finalGrade() < 60) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        scanner.close();
    }
}
