package Exercícios;
import java.util.Scanner;

public class Exercicio40 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quanto ganha por hora?");
    double valorHora = sc.nextDouble();

    System.out.println("Número de horas trabalhadas no mês:");
    double horas = sc.nextDouble();

    double salarioBruto = valorHora * horas;

    double descontoINSS = salarioBruto * 0.08;
    double descontoIR = salarioBruto * 0.11;
    double descontoSindicato = salarioBruto * 0.05;

    double salarioLiquido = salarioBruto - descontoINSS - descontoIR - descontoSindicato;

    System.out.println("Salário bruto: R$ " + salarioBruto);
    System.out.println("Desconto INSS: R$ " + descontoINSS);
    System.out.println("Desconto IR: R$ " + descontoIR);
    System.out.println("Desconto Sindicato: R$ " + descontoSindicato);
    System.out.println("Salário líquido: R$ " + salarioLiquido);

    sc.close();
  }
}
