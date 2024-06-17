public class Pedido {
    private int numeroPedido;
    private int codigoProduto;
    private double precoUnitario;
    private int quantidade;

    public Pedido(int numeroPedido, int codigoProduto, double precoUnitario, int quantidade){
        setNumeroPedido(numeroPedido);
        setCodigoProduto(codigoProduto);
        setPrecoUnitario(precoUnitario);
        setQuantidade(quantidade);
    }
    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public int getQuantidade() {
        return quantidade;
    }
}
