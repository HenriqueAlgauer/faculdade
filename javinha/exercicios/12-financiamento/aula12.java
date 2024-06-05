class Financiamento{
    public double valorFinanciado;
    public int parcelas;
    public double taxa;

    public double valorTotal(){
        var total = getValorFinanciado() + (getValorFinanciado() * (getTaxa()*0.01) * getParcelas());
        return total;
    }

    public double valorPrestacao(){
        return valorTotal()  / getParcelas();
    }

    public void info(){
        System.out.println("Valor financiado: " +getValorFinanciado());
        System.out.println("Parcelas: " +getParcelas());
        System.out.println("Taxa: " +getTaxa());
        System.out.println("Total: " + valorTotal());
    }

    public Financiamento(double valorFinanciado, int parcelas, double taxa){

        if( valorFinanciado < 0 || taxa < 0 || parcelas < 0){
            throw new RuntimeException("A entrada deve ser de pelo menos 20%");
        }
        setValorFinanciado(valorFinanciado);
        setParcelas(parcelas);
        setTaxa(taxa);
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
    public double getTaxa() {
        return taxa;
    }

    public void setValorFinanciado(double valorFinanciado) {
        this.valorFinanciado = valorFinanciado;
    }
    public double getValorFinanciado() {
        return valorFinanciado;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
    public int getParcelas() {
        return parcelas;
    }
}

public class aula12 {
    public static void main(String[] args){
        double valorFinanciado = 20000;
        int parcelas = 10;
        double taxa = 1;
        try{
            Financiamento f = new Financiamento(valorFinanciado, parcelas, taxa);
            System.out.println(f.valorPrestacao()); 
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
