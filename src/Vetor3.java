public class Vetor3 {

    public static void main(String[] args) {

        int tamanho = 5;
        int[] vetor = new int[tamanho]; //criando o vetor e colocando tamanho de 5 posicoes 

        vetor[0] = 21; // alimentando o vetor com o numero 21
        vetor[1] = 28; 
        vetor[2] = 38; 
        vetor[3] = 31; 
        vetor[4] = 41; 

        for(int i=0; i < tamanho; i++){
            System.out.printf("Vetor na posição %d é %d \n", i,vetor[i]); //imprimindo todos os vetores pelo for
        } 

    }
}