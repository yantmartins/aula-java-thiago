package Exercícios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo = sc.nextInt();

        System.out.println("Digite um número real: ");
        double real = sc.nextDouble();

        double produto = primeiro * (segundo / 2.0);
        double soma = (3 * primeiro) + real;
        double cubo = real * real * real;

        System.out.println("O produto do primeiro com a metade do segundo é igual a: " + produto);
        System.out.println("A soma do triplo do primeiro com o número real é igual a: " + soma);
        System.out.println("O número real ao cubo é igual a: " + cubo);

        sc.close();
    }
}
