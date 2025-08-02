import java.util.Scanner;

public class Vetor6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = 5;
        int vet[] = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            System.out.printf("Informe o %dº valor de %d: ", (i + 1), n);
            vet[i] = entrada.nextInt();
        }

        entrada.close();
    }
}
