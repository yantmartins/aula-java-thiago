package Exercícios;

import java.util.Scanner;

public class Exercicio28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a idade:");
    int idade = sc.nextInt();

    System.out.println("Digite o tempo de serviço (anos):");
    int tempo = sc.nextInt();

    if (idade >= 65 || tempo >= 30 || (idade >= 60 && tempo >= 25)) {
      System.out.println("Pode se aposentar");
    } else {
      System.out.println("Não pode se aposentar");
    }

    sc.close();
  }
}
