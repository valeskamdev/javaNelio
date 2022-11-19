package aula.product.application;

import aula.product.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Fazer um programa para ler os daddos de um produto em estoque (nome, preco e quantidade no estoque).
        Em seguida:
        - mostrar os dados do produto (nome, preco quantidadde no estoque, valor total no estoque)
        - realizar uma entrada no estoque e mostrar novamente os dados do produto
        - realizar uma saida no estoque e mostrar novamente os dados do produto */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = scanner.nextLine();
        System.out.println("Price: ");
        product.price = scanner.nextDouble();
        System.out.println("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        System.out.println(product);


        scanner.close();

    }
}
