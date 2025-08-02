package Exercícios;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        System.out.print("Digite o primeiro número: ");
        int primeiro = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundo = sc.nextInt();

       
        System.out.println("\nAntes da troca:");
        System.out.println("A = " + primeiro);
        System.out.println("B = " + segundo);

        
        int temp = primeiro;
        primeiro = segundo;
        segundo = temp;

        System.out.println("\nDepois da troca:");
        System.out.println("A = " + primeiro);
        System.out.println("B = " + segundo);

        sc.close();
    }
}
