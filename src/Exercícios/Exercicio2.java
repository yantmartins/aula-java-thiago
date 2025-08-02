package Exercícios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int inteiro = sc.nextInt();

            if (inteiro > 10) {
                System.out.println("O número digitado é maior que 10");
            } else {
                System.out.println("O número é menor que 10");
            }
        sc.close();    
    }
}
