package Exercícios;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Nota prova 1:");
        double n1 = sc.nextDouble();
    
        System.out.println("Nota prova 2:");
        double n2 = sc.nextDouble();
    
        System.out.println("Nota prova 3:");
        double n3 = sc.nextDouble();
    
        double media = (n1*1 + n2*1 + n3*2) / 4;
    
        System.out.println("Média: " + media);
    
        if (media >= 60) {
          System.out.println("Aprovado");
        } else {
          System.out.println("Reprovado");
        }
    
        sc.close();
    }
}
