import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private List<Integer> codigosProdutos;
    private List<Double> precosUnitarios;
    private List<Integer> quantidades;

    public Pedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        this.codigosProdutos = new ArrayList<>();
        this.precosUnitarios = new ArrayList<>();
        this.quantidades = new ArrayList<>();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public List<Integer> getCodigosProdutos() {
        return codigosProdutos;
    }

    public List<Double> getPrecosUnitarios() {
        return precosUnitarios;
    }

    public List<Integer> getQuantidades() {
        return quantidades;
    }

    public void adicionarProduto(int codigoProduto, double precoUnitario, int quantidade) {
        this.codigosProdutos.add(codigoProduto);
        this.precosUnitarios.add(precoUnitario);
        this.quantidades.add(quantidade);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < codigosProdutos.size(); i++) {
            sb.append(numeroPedido).append(";")
              .append(codigosProdutos.get(i)).append(";")
              .append(precosUnitarios.get(i)).append(";")
              .append(quantidades.get(i)).append("\n");
        }
        return sb.toString();
    }
}
