package aula.lista;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marcos");  // adicionando o elemento "Marcos" na posição 2 da lista

        System.out.println(list.size());  // imprimindo o tamanho da lista

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------");

        list.removeIf(x -> x.charAt(0) == 'M');  // removendo todos os elementos que começam com a letra M

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------");

        System.out.println("Inde Of Bob: " + list.indexOf("Bob"));   // imprimindo o índice do elemento "Bob" na lista
        System.out.println("Inde Of Bob: " + list.indexOf("Marcos"));  // retorna -1, pois não foi encontrado

        System.out.println("------------");

        // filtrando a lista e retornando uma nova lista com os elementos que iniciam com a letra A
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').toList();

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------");

        // filtrando a lista e retornando o primeiro elemento que inicia com a letra A. caso não encontre nenhum elemento, retorna nulo
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

        System.out.println(name);
    }
}
