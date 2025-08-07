import java.util.ArrayList;
import java.util.List;

public class Lista2 {
    public static void main(String[] args) {
        
        List<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(8.6);
        notas.add(9.1);
        notas.add(7.9);

        int tamanho_vetor = notas.size();

        double nota1 = notas.get(0);

        System.out.println("Tamanho do vetor: " + tamanho_vetor);
        System.out.println("1ª Nota : " + nota1);
    }
    
}
