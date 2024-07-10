import java.util.ArrayList;
import java.util.List;

public class biblioteca implements catalogo{
    public List<itemBiblioteca> itens;

    public biblioteca(){
        this.itens = new ArrayList<>();
    }

    @Override
    public void adicionarItem(itemBiblioteca item){
        itens.add(item);
    }

    @Override
    public void listarItens(){
        for(itemBiblioteca item: itens){
            System.out.println(item.getTitulo() + "(" + item.getAnoPublicado()+")- ");
        }
    }
}
