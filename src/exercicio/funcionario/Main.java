package exercicio.funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler os dados de um funcionario (nome, salario bruto e imposto).
           Em seguida, mostrar os dados do funcionario (nome e salario liquido). Em seguida, aumentar
           o salsrio do funcionario com base em uma porcentagem dada(somente o salario bruto é afetado
           pela porcentagem) e mostrar novamente os dados do funcionario. Use a classe Employee. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee();

        employee.name = scanner.nextLine();
        employee.grossSalary = scanner.nextDouble();
        employee.tax = scanner.nextDouble();

        System.out.println("Name: " + employee.name);
        System.out.printf("Gross salary: %.2f%n", employee.grossSalary);
        System.out.printf("Tax: %.2f%n", employee.tax);

        System.out.println();
        System.out.printf("Employee: " + employee + "%.2f", employee.netSalary() );

        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double calculation = scanner.nextDouble();

        System.out.println();
        System.out.printf("Updated data: " + employee + "%.2f", employee.increaseSalary(calculation));
    }
}
