package Exercícios;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de aquisição do produto: ");
        double valor = sc.nextDouble();
        double novo_valor; 

        if (valor < 50) {
            novo_valor = valor * 1.45;
        } else {
            novo_valor = valor * 1.30;
        }

        System.out.printf("O valor da venda do produto é: R$ %.2f\n", novo_valor);

        sc.close();
    }
    
}
