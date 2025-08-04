package Exercícios;

import java.util.Scanner;

public class Exercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Nota Trabalho de Laboratório:");
    double t = sc.nextDouble();

    System.out.println("Nota Avaliação Semestral:");
    double a = sc.nextDouble();

    System.out.println("Nota Exame Final:");
    double e = sc.nextDouble();

    double media = (t*2 + a*3 + e*5) / 10;

    System.out.println("Média: " + media);

    if (media >= 0 && media <= 2.9) {
      System.out.println("Reprovado");
    } else if (media >= 3 && media <= 5.9) {
      System.out.println("Recuperação");
    } else if (media >= 6 && media <= 10) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Nota inválida");
    }

    sc.close();
  }
}
