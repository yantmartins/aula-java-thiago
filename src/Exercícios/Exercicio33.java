package Exercícios;

import java.util.Scanner;

public class Exercicio33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o preço antigo:");
    double preco = sc.nextDouble();

    double aumento;

    if (preco <= 50) {
      aumento = preco * 0.05;
    } else if (preco > 50 && preco <= 100) {
      aumento = preco * 0.10;
    } else {
      aumento = preco * 0.15;
    }

    double precoNovo = preco + aumento;

    System.out.println("Preço novo: " + precoNovo);

    if (precoNovo <= 80) {
      System.out.println("Barato");
    } else if (precoNovo <= 120) {
      System.out.println("Normal");
    } else if (precoNovo <= 200) {
      System.out.println("Caro");
    } else {
      System.out.println("Muito caro");
    }

    sc.close();
  }
}
