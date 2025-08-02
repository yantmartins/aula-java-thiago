package Exercícios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();

        
        if (numero >= 0) {
            int quadrado = numero * numero; 
            double raiz = Math.sqrt(numero);

            System.out.printf("O quadrado de %d é: %d\n", numero, quadrado);
            System.out.printf("A raiz de %d é: %.2f\n", numero, raiz);
        } else {
            System.out.println("Número negativo não válido");
        }
        sc.close();
    }
}
