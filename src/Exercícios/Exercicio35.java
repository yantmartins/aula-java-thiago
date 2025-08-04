package Exercícios;

import java.util.Scanner;

public class Exercicio35 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o salário atual:");
    double salario = sc.nextDouble();

    System.out.println("Digite o tempo de serviço (anos):");
    int tempo = sc.nextInt();

    double reajuste = 0;
    double bonus = 0;

    if (salario <= 500) {
      reajuste = salario * 0.25;
    } else if (salario <= 1000) {
      reajuste = salario * 0.20;
    } else if (salario <= 1500) {
      reajuste = salario * 0.15;
    } else if (salario <= 2000) {
      reajuste = salario * 0.10;
    } else {
      reajuste = 0;
    }

    if (tempo < 1) {
      bonus = 0;
    } else if (tempo <= 3) {
      bonus = 100;
    } else if (tempo <= 6) {
      bonus = 200;
    } else if (tempo <= 10) {
      bonus = 300;
    } else {
      bonus = 500;
    }

    if (reajuste == 0 && bonus == 0) {
      System.out.println("Não tem direito a aumento");
    } else {
      double salarioFinal = salario + reajuste + bonus;
      System.out.println("Salário final reajustado: R$ " + salarioFinal);
    }

    sc.close();
  }
}
