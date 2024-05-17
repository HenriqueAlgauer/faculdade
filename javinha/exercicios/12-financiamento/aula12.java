class Financiamento{
    public double valorTotal;
    public double entrada;
    public int parcelas;

    public double valorPrestacao(){
        return((getValorTotal() - getEntrada()) / getParcelas());
    }

    public Financiamento(double valorTotal, double entrada, int parcelas){

        if(entrada < valorTotal * 0.2){
            throw new RuntimeException("A entrada deve ser de pelo menos 20%");
        }
        else if(parcelas < 6){
            throw new RuntimeException("O numero minimo de parcelas deve ser 6");
        }
        setValorTotal(valorTotal);
        setEntrada(entrada);
        setParcelas(parcelas);
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public double getValorTotal() {
        return valorTotal;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }
    public double getEntrada() {
        return entrada;
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
        double valorTotal = 1000;
        double entrada = 200;
        int parcelas = 10;
        try{
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.valorPrestacao()); 
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
