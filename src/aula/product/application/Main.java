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

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name, price);

        // definindo o nome do produto para "Computer"
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());

        // definindo o preco do produto para 1200
        product.setPrice(1200);
        System.out.println("Updated price: " + product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        scanner.close();
    }
}
