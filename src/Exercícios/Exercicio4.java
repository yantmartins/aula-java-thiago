package Exercícios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo = sc.nextInt();

        System.out.println("Digite o terceiro número: ");
        int terceiro = sc.nextInt();

        if (primeiro < segundo && segundo < terceiro ) {
            System.out.println("Os números estão em ordem crescente: " + primeiro + "," + segundo + "," + terceiro);
        } else {
            System.out.println("Os números não estão em ordem crescente");
        }
        sc.close();

    }
}
