import java.util.*;

class Fruta{
    String nome;
    int quantidade;
    double preco;

    public Fruta(String nome,int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preco: " + this.preco);
    }
}

public class aula0802 {
    public static void main(String[] args){

        Map<String, Fruta> estoque = new TreeMap<>();

        estoque.put("Maca", new Fruta("Maca", 20, 2.5));
        estoque.put("Banana", new Fruta("Banana", 26, 12));
        estoque.put("Maca", new Fruta("Laranja", 12, 12.3));

        for (Map.Entry<String, Fruta> fruta : estoque.entrySet()) {
            fruta.getValue().mostrarInformacoes();
            System.out.println();
        }

    }

}
