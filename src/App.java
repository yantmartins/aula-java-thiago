import java.util.Scanner;

public class App
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String nome = "Yan Torres Martins";
	    int numero = 20;
	    double reais = 1599.50;
	
	    
	    System.out.println("Olá mundo!!!");
	    System.out.println("Bem vindo " + nome);
	    System.out.println("Sua idade é: " + numero);
	    System.out.println("Você tem: R$" +reais);
		sc.close();
	}
}