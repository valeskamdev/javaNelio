package exercicio;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {
    public static void main(String[] args) {

        /* Escreva um programa que repita a leitura de uma senha até que ela seja inválida.
           Para cada leitura de senha incorreta informada, escrever a mensagem "Senha inválida".
           Quando a senha dor informada corretamente deve ser impressa a mensagem "Acesso Permitido"
           e o algoritmo encerrado. Considere que a senha correta é o valor 2002 */

        Scanner scanner = new Scanner(System.in);
        int senha = scanner.nextInt();

        while (senha != 2002) {
            System.out.println("Senha inválida");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso permitido");


        /* Escreva um programa para ler as coordenada (X, Y) de uma quantidade indetermina de pontos
        no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo
        será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situacao sem escrever
        a mensagem alguma). */

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante");
            } else {
                System.out.println("Quarto quadrante");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }


        /* Escreva um algoritmo para ler o tipo de combustível abastecido (codificando da seguinte forma: 1.Álcool
           2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
           solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for
           o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
           tipo de combustível. */

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        int tipo = scanner.nextInt();

        while (tipo != 4) {
            if (tipo == 1) {
                alcool++;
            } else if (tipo == 2) {
                gasolina++;
            } else if (tipo == 3) {
                diesel++;
            }
            tipo = scanner.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}
