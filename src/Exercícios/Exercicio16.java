package Exercícios;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Informe o valor da prestação: ");
        double prestacao = sc.nextDouble();

        double limite = salario * 0.2;

        if (prestacao > limite) {
            System.out.println("Empréstimo não concedido");
        } else {
            System.out.println("Empréstimo concedido");
        }

        sc.close();
    }
}
