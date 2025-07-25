import java.util.Scanner;

public class Texto {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite SIM/NÃO");
        String confirmacao = scan.next();
        System.out.println("Texto Digitado: " + confirmacao);

        scan.close();
    }
}
