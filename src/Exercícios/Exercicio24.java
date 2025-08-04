package Exercícios;

import java.util.Scanner;

public class Exercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha a operação:");
    System.out.println("1 - Soma");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");

    int op = sc.nextInt();

    System.out.println("Digite o primeiro número:");
    double n1 = sc.nextDouble();

    System.out.println("Digite o segundo número:");
    double n2 = sc.nextDouble();

    double res;

    if (op == 1) {
      res = n1 + n2;
      System.out.println("Resultado: " + res);
    } else if (op == 2) {
      res = n1 - n2;
      System.out.println("Resultado: " + res);
    } else if (op == 3) {
      res = n1 * n2;
      System.out.println("Resultado: " + res);
    } else if (op == 4) {
      if (n2 == 0) {
        System.out.println("Erro: divisão por zero");
      } else {
        res = n1 / n2;
        System.out.println("Resultado: " + res);
      }
    } else {
      System.out.println("Opção inválida");
    }

    sc.close();
  }
}
