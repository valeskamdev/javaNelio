package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Operadora {
    public static void main(String[] args) {

        /* Uma operadora de telefonia cobra R$50.00 por um plano básico que da direito a 100 minutos
        de telefone. Cada minuto que exceder a franquia de 100 minutos custará R$2.00. Fazer um programa
        para ler a quantidade de minutos que a pessoa consumiu, daí mostrar o valor a ser pago */


        Locale.setDefault(Locale.US);  // definindo a localidade padrão para US
        Scanner scanner = new Scanner(System.in);

        int minutos = scanner.nextInt();
        double conta = 50;

        if (minutos > 100) {
            conta += (minutos - 100) * 2;
        }
        System.out.printf("Valor da conta: R$ %.2f%n", conta);
        scanner.close();
    }
}
