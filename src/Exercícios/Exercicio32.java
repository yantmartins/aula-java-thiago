package Exercícios;

import java.util.Scanner;

public class Exercicio32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o código do produto:");
    int cod = sc.nextInt();

    System.out.println("Digite a quantidade:");
    int qtd = sc.nextInt();

    double preco = 0;
    boolean valido = true;

    if (cod == 100) {
      preco = 12.00;
    } else if (cod == 102) {
      preco = 18.50;
    } else if (cod == 103) {
      preco = 25.50;
    } else if (cod == 104) {
      preco = 17.00;
    } else if (cod == 105) {
      preco = 9.50;
    } else if (cod == 106) {
      preco = 6.00;
    } else {
      System.out.println("Código inválido");
      valido = false;
    }

    if (valido) {
      double total = preco * qtd;
      System.out.println("Total a pagar: R$ " + total);
    }

    sc.close();
  }
}
