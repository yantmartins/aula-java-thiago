package Exercícios.Matrizes;

public class Ex01While {
    public static void main(String[] args) {
        int [][] matriz = new int[3][3];
        int valor = 1;

        int i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 3) {
                matriz[i][j] = valor;
                valor++;
                j++;
            }
            i++;
        }

        i = 0;
        while (i < 3) {
            int j = 0;
            while (j < 3) {
                System.out.print(matriz[i][j] + " "); 
                j++;
            }
            System.out.println(); 
            i++;
        }
    }
}
