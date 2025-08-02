package Exercícios;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu gênero pelas letras F ou M: ");
        char letra = sc.next().charAt(0);
        letra = Character.toUpperCase(letra);

        if (letra == 'F') {
            System.out.println("F - Feminino");
        } else if (letra == 'M') {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Gênero inválido");
        }

        sc.close();
    }
}
