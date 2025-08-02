package Exercícios;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int primeiro = sc.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int segundo = sc.nextInt();

        if(primeiro > segundo) {
            int diferenca = primeiro - segundo;
            System.out.printf("O maior número é %d\n", primeiro);
            System.out.printf("A diferença entre eles é de: %d\n" , diferenca);         
        } else if (segundo > primeiro) {
            int diferenca = segundo - primeiro;
            System.out.printf("O maior número é %d\n", segundo);
            System.out.printf("A diferença entre eles é de: %d\n" , diferenca);
        } else {
            System.out.println("Os números são iguais. Sem Diferença");
        }
        sc.close();
    }    
}
