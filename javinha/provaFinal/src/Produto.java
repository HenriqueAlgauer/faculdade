public class Produto {
    private int codigoProduto;
    private String nomeProduto;
    private double precoUnitario;
    private int quantidadeEstoque;

    public Produto(int cod, String nome, double preco, int estoque){
        setCodigoProduto(cod);
        setNomeProduto(nome);
        setPrecoUnitario(preco);
        setQuantidadeEstoque(estoque);
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    
    @Override
    public String toString() {
        return codigoProduto + ";" + nomeProduto + ";" + precoUnitario + ";" + quantidadeEstoque;
    }
}
