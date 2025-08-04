package Exercícios;

import java.util.Scanner;

public class Exercicio27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha a opção:");
    System.out.println("1 - Soma");
    System.out.println("2 - Diferença (maior - menor)");
    System.out.println("3 - Produto");
    System.out.println("4 - Divisão");

    int op = sc.nextInt();

    System.out.println("Digite o primeiro número:");
    double x = sc.nextDouble();

    System.out.println("Digite o segundo número:");
    double y = sc.nextDouble();

    if (op == 1) {
      System.out.println("Resultado: " + (x + y));
    } else if (op == 2) {
      if (x > y) {
        System.out.println("Resultado: " + (x - y));
      } else {
        System.out.println("Resultado: " + (y - x));
      }
    } else if (op == 3) {
      System.out.println("Resultado: " + (x * y));
    } else if (op == 4) {
      if (y == 0) {
        System.out.println("Erro: divisão por zero");
      } else {
        System.out.println("Resultado: " + (x / y));
      }
    } else {
      System.out.println("Opção inválida");
    }

    sc.close();
  }
}
