package Exercícios;

import java.util.Scanner;

public class Exercicio29 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor do produto:");
    double valor = sc.nextDouble();

    System.out.println("Digite o estado (MG, SP, RJ, MS):");
    String estado = sc.next();

    double precoFinal = 0;
    boolean valido = true;

    if (estado.equals("MG")) {
      precoFinal = valor + (valor * 0.07);
    } else if (estado.equals("SP")) {
      precoFinal = valor + (valor * 0.12);
    } else if (estado.equals("RJ")) {
      precoFinal = valor + (valor * 0.15);
    } else if (estado.equals("MS")) {
      precoFinal = valor + (valor * 0.08);
    } else {
      System.out.println("Estado inválido");
      valido = false;
    }

    if (valido) {
      System.out.println("Preço final: " + precoFinal);
    }

    sc.close();
  }
}
