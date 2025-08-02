package Exercícios;

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Informe o seu gênero (F para feminino, M para masculino): ");
        char letra = sc.next().charAt(0);
        letra = Character.toUpperCase(letra);

        double peso;

        if (letra == 'F'){
            peso = (62.1 * altura) - 44.7;
            System.out.printf("O seu peso ideal é de : %.2f kg\n", peso);
        } else if (letra == 'M') {
            peso = (72.7 * altura) - 58;
            System.out.printf("O seu peso ideal é de : %.2f kg\n", peso);
        } else {
            System.out.println("Sexo informado inválido. Use apenas M ou F");
        }
        sc.close();
        



    }
}
