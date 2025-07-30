public class Vetor4 {

    public static void main(String[] args) {
        
        //Lista de compras no hortfrut
        String[] frutas = {"Banana","Maçã","Kiwi","Mamão"};
        //entre chaves os elementos Strings do vetor
        String fruta_preferida = frutas[2]; //guarda na nova variavel a fruta no indice indicado
        System.out.println("Minha fruta preferida é: "+fruta_preferida);

        for(int i=0; i <frutas.length; i++){
            System.out.println(frutas[i]);
        }
    }
    
}
