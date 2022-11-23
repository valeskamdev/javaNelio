package exercicio.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario)
         de N funcionários. Não deve haver repetição de id. Em seguida, efetuar o aumento de X por
         cento no salário de um determinado funcionário. Para isso, o programa deve ler um id e o
         valor X. Se o id informado não existir, mostrar uma mensagem e abortar a operação. Ao final,
         mostrar a listagem atualizada dos funcionários. Lembre-se de aplicar a técnica de encapsulamento
         para não permitir que o salário possa ser mudado livremente. Um salário só pode ser aumentado
         com base em uma operação de aumento por porcentagem dada. */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            int id = scanner.nextInt();

            // verificando se o id já está na lista
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = scanner.nextInt();
            }

            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            list.add(new Funcionario(id, name, salary));

            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();

        // verificando se o id está na lista
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }

        scanner.close();
    }

    // verificando se a lista tem o id do funcionario forncecido
    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
