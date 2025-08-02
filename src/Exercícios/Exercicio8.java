package Exercícios;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        if (numero >= 0) {
            double raiz = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raiz);
        } else {
            System.out.println("Número negativo. Não é possível calcular a raiz.");
        }
        sc.close();
    }
    
}
