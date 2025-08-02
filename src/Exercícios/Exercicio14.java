package Exercícios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        if (nota1 < 0.0 || nota1 > 10.0 || nota2 < 0.0 || nota2 > 10.0) {
            System.out.println("Nota inválida");
        } else {
            double media = (nota1 + nota2) / 2;
            System.out.printf("A média das notas é de %.2f", media);
        }
        sc.close();
    }
    
}
