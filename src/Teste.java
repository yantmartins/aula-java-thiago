import java.util.Scanner;

public class Teste
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String nome = "Yan";
	    String sobrenome = "Torres";
	    String cidade = "Campo Grande";
	    String hobby = "Volei";
	    
	    System.out.printf("Olá %s %s você mora em %s e gosta de %s", nome,sobrenome, cidade, hobby);
	    
		sc.close();
	}
}