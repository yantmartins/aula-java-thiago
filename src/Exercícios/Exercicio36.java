package Exercícios;

import java.util.Scanner;

public class Exercicio36 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o custo de fábrica:");
    double custo = sc.nextDouble();

    double comissao = 0;
    double impostos = 0;

    if (custo <= 12000) {
      comissao = custo * 0.05;
      impostos = 0;
    } else if (custo <= 25000) {
      comissao = custo * 0.10;
      impostos = custo * 0.15;
    } else {
      comissao = custo * 0.15;
      impostos = custo * 0.20;
    }

    double custoFinal = custo + comissao + impostos;

    System.out.println("Custo ao consumidor: R$ " + custoFinal);

    sc.close();
  }
}
