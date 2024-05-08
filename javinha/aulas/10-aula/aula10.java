import java.util.ArrayList;

class Veiculo {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double combustivel;
    private double consumoMedio;

    
    public double calculaAutonomia(){
        double autonomia = getCombustivel() * getConsumoMedio();
        if(autonomia < 30){
            System.out.println("Precisa abastecer! Automina de: " + autonomia);
        }
        return autonomia;
    }



    public void realizarViagem(double distancia){
        double autonomia = calculaAutonomia();

        double combustivelUsado = distancia/getConsumoMedio();
        double restante = getCombustivel() - combustivelUsado;

        if(autonomia < distancia){
            System.out.println( "Não foi possível realizar a viagem!");
        }else{
            System.out.println("Viagem realizada com sucesso! Restaram " + restante + " litros de combustível no veículo!");
            setCombustivel(restante);
        }
    }

    public void info(){
        String mensagem = "";
        double autonomia = getCombustivel() * getConsumoMedio();
        if(autonomia < 30){
            mensagem = "não";
        }else{
            mensagem = "sim";
        }
        System.out.println("Veículo: " + getMarca() + " " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAnoFabricacao());
        System.out.println("Autonomia: " + autonomia +"km");
        System.out.println("Precisa abastecer ? " + mensagem ); 
    }

    public Veiculo(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
        this.consumoMedio = consumoMedio;
    }
 
    public String getMarca() {
        return marca;
    }
 
    public void setMarca(String marca) {
        this.marca = marca;
    }
 
    public String getModelo() {
        return modelo;
    }
 
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
 
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
 
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
 
    public double getCombustivel() {
        return combustivel;
    }
 
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
 
    public double getConsumoMedio() {
        return consumoMedio;
    }
 
    public void setConsumoMedio(double consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
}

class Carro extends Veiculo{

    public void acelerar(){
        System.out.println("Carro acelerando");
    }
    public void frear(){
        System.out.println("Carro freando");
    }
    public Carro(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }
}


class Moto extends Veiculo{

    public void acelerar(){
        System.out.println("Moto acelerando");
    }
    public void frear(){
        System.out.println("Moto freando");
    }
    public Moto(String marca, String modelo, int anoFabricacao, double combustivel, double consumoMedio){
        super(marca, modelo, anoFabricacao, combustivel, consumoMedio);
    }
}

public class aula10 {
    public static void main(String[] args){
        ArrayList<Veiculo> frota = new ArrayList<>();

        Carro fuque = new Carro("Vw", "Fuque", 2010, 30, 9);
        Moto moto = new Moto("Honda", "125", 2000, 10, 40);
    
        System.out.println("Oi");
    }
}