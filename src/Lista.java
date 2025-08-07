import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> listaNome = new ArrayList<>();
        listaNome.add("Yan");
        listaNome.add("Lia");
        listaNome.add("José");
        listaNome.add("Paulo");
        listaNome.add("Isa");

        System.out.println(listaNome.size()); // 5
        listaNome.remove(2); // remove "José"
        System.out.println(listaNome.size()); // 4
        System.out.println(listaNome.get(0)); // "Yan"

        String nome = listaNome.get(2); // "Paulo"
        System.out.println(nome);
        listaNome.set(3, "Ste"); // altera "Isa" para "Ste"

        String novo_nome = listaNome.get(3); // CORRIGIDO: índice válido
        System.out.println(novo_nome); // "Ste"
    }
}
