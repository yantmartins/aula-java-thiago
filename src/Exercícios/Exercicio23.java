package Exercícios;

import java.util.Scanner;

public class Exercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a base maior:");
    double baseMaior = sc.nextDouble();

    System.out.println("Digite a base menor:");
    double baseMenor = sc.nextDouble();

    System.out.println("Digite a altura:");
    double altura = sc.nextDouble();

    if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
      System.out.println("Valores inválidos");
      sc.close();
      return;
    }

    double area = ((baseMaior + baseMenor) * altura) / 2;

    System.out.println("Área do trapézio: " + area);

    sc.close();
  }
}
