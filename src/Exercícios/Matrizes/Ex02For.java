package Exercícios.Matrizes;

import java.util.Scanner;

public class Ex02For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] matrix = new String [4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da linha " + i + " coluna " + j + ": ");
                matrix[i][j] = sc.nextLine();
            }
        }

        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] +  "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
