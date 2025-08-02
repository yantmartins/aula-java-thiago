package Exercícios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número de horas trabalhadas: ");
        double horasTrabalhadas = sc.nextDouble();

        double VALOR_HORA = 40.50;
        double salarioBruto = horasTrabalhadas * VALOR_HORA;
        double salarioLiquido;

        if (salarioBruto > 2500.00) {
            salarioLiquido = salarioBruto - (salarioBruto * 0.11);
        } else {
            salarioLiquido = salarioBruto;
        }

        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        sc.close();
    }
}
