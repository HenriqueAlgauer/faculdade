import java.util.Map;
import java.util.TreeMap;

public class aula08 {
    public static void main(String[] args){
            
        Map <String, Integer> estoque = new TreeMap<>();
        estoque.put("Maçã", 10);
        estoque.put("Laranja", 20);
        estoque.put("Banana", 30);

        mostrarEstoque(estoque);

        if(estoque.containsKey("Maçã")){
            System.out.println("Tem maçã no estoque");
        }
        
    }

    public static void mostrarEstoque(Map<String, Integer> estoque){
        for(Map.Entry<String, Integer> fruta : estoque.entrySet()){
            System.out.println("Fruta: " + fruta.getKey() + " || Quantidade: " + fruta.getValue());
        }
    }
}
