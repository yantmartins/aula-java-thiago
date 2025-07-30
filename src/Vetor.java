public class Vetor {

    public static void main(String[] args) {
        
        int[] vet = new int[10];

        vet[0] = 10; // atribui o valor 10 a posicao 0 do vetor
        vet[1] = vet[0] + 10; 
        vet[2] = 20; 
        vet[3] = 30;
        vet[4] = 40; 
        vet[5] = 50; 
        vet[6] = 60; 
        vet[7] = 70; 
        vet[8] = 80; 
        vet[9] = 90 + vet[0]; 

        System.out.println(vet[1]);
        System.out.println(vet[9]);
    }
}