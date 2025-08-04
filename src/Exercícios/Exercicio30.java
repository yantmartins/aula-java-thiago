package Exercícios;

import java.util.Scanner;

public class Exercicio30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a distância em Km:");
    double km = sc.nextDouble();

    System.out.println("Digite a quantidade de litros consumidos:");
    double litros = sc.nextDouble();

    double consumo = km / litros;

    System.out.println("Consumo: " + consumo + " Km/l");

    if (consumo < 8) {
      System.out.println("Venda o carro!");
    } else if (consumo >= 8 && consumo <= 14) {
      System.out.println("Econômico!");
    } else if (consumo > 14) {
      System.out.println("Super econômico!");
    }

    sc.close();
  }
}
