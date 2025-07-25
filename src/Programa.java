import java.util.Scanner;
//IMPORTAR O SCANNER

public class Programa {

    public static void main(String[] args){
        //DECLARAR  O SCANNER DENTRO DA MAIN
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        num = scan.nextInt();

        if(num >= 18){
            System.out.println("Maior de idade");
        } else{
            System.out.println("Menor de idade");
        }
        
        scan.close();
    }
    
}
