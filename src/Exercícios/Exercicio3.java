package Exercícios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiro = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int segundo = sc.nextInt();

        if( primeiro > segundo) {
            System.out.println("O primeiro número digitado é maior que o segundo");
        } else if (segundo > primeiro) {
            System.out.println("O segundo número digitado é maior que o primeiro");
        } else {
            System.out.println("Os números são iguais");
        }
        sc.close();
    }
    
}
