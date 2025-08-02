package Exercícios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Em qual turno você estuda?  digite M - Matutino ou V - Vespertino ou N - Noturno");
        char turno = sc.next().charAt(0);
        turno = Character.toUpperCase(turno);

        if (turno == 'M') {
            System.out.println("Bom Dia!");
        } else if (turno == 'V') {
            System.out.println("Boa Tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor inválido");
        }
        sc.close();
    }
}
