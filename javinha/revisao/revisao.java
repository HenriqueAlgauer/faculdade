class Funcionario{
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        setNome(nome);
        setSalario(salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}

interface Beneficio{
    double calcularBeneficio();
}

class Gerente extends Funcionario implements Beneficio{
    private double bonus;

    public Gerente(String nome, double salario, double bonus){
        super(nome, salario);
        setBonus(bonus);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularBeneficio(){
        return getSalario() + bonus;
    }

    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Bônus: " + getNome());
        System.out.println("Benefício total: " + calcularBeneficio());
    }
}

public class revisao {
    public static void main(String[] args){
        Funcionario func = new Funcionario("Fun1", 1000);
        Gerente xerente = new Gerente("Xerente", 1000, 1800);

        func.exibirInformacoes();
        xerente.exibirInformacoes();
    }
}
