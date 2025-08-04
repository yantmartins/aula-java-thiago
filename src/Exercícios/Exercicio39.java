package Exercícios;
import java.util.Scanner;

public class Exercicio39 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite a área a ser pintada (m²):");
    double area = sc.nextDouble();

    double litrosNecessarios = area / 6;

    int latas = (int) Math.ceil(litrosNecessarios / 18);
    double precoLatas = latas * 80;

    int galoes = (int) Math.ceil(litrosNecessarios / 3.6);
    double precoGaloes = galoes * 25;

    System.out.println("Comprando só latas de 18 litros:");
    System.out.println("Quantidade de latas: " + latas);
    System.out.println("Preço total: R$ " + precoLatas);

    System.out.println("Comprando só galões de 3,6 litros:");
    System.out.println("Quantidade de galões: " + galoes);
    System.out.println("Preço total: R$ " + precoGaloes);

    sc.close();
  }
}
