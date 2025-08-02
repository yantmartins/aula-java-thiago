package Exercícios;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro maior que zero: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Número inválido!");
        } else {
            int soma = 0;

            for (int n = numero; n > 0; n = n / 10) {
                int digito = n % 10;
                soma += digito;
            }

            System.out.println("A soma dos algarismos de " + numero + " é: " + soma);
        }

        sc.close();
    }
}
