package Exercícios;

import java.util.Scanner;

public class Exercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a idade do nadador:");
    int idade = sc.nextInt();

    if (idade >= 5 && idade <= 12) {
      System.out.println("Categoria Infantil");
    } else if (idade > 12 && idade <= 17) {
      System.out.println("Categoria Juvenil");
    } else if (idade > 17) {
      System.out.println("Categoria Sênior");
    } else {
      System.out.println("Idade fora da faixa");
    }

    sc.close();
  }
}
