package Exercícios;

import java.util.Scanner;

public class Exercicio25 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o ano:");
    int ano = sc.nextInt();

    boolean bissexto = false;

    if (ano % 400 == 0) {
      bissexto = true;
    } else if (ano % 4 == 0 && ano % 100 != 0) {
      bissexto = true;
    }

    if (bissexto) {
      System.out.println("Ano bissexto");
    } else {
      System.out.println("Não é ano bissexto");
    }

    sc.close();
  }
}
