package Exercícios.Matrizes;

public class Ex03For {
    
    public static void main(String[] args) {
        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int [][] nova_matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nova_matriz[i][j] = matriz[i][j] * 5;
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(nova_matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
