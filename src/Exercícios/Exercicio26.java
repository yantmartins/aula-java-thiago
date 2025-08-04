package Exercícios;

import java.util.Scanner;

public class Exercicio26 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite lado A:");
    double a = sc.nextDouble();

    System.out.println("Digite lado B:");
    double b = sc.nextDouble();

    System.out.println("Digite lado C:");
    double c = sc.nextDouble();

    if (a < b + c && b < a + c && c < a + b) {
      if (a == b && b == c) {
        System.out.println("Triângulo equilátero");
      } else if (a != b && b != c && a != c) {
        System.out.println("Triângulo escaleno");
      } else {
        System.out.println("Triângulo isósceles");
      }
    } else {
      System.out.println("Não é triângulo");
    }

    sc.close();
  }
}
