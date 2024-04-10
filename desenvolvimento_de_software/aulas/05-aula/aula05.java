class aula05 {
    public static void main(String[] args){

    }
}

class Funcionario{
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo){

    }

    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
}

class Departamento{
    private String nome;
    private Funcionario[] funcionarios;
    private int numFuncionarios;

    public Departamento(String nome){
        this.nome = nome;
        this.funcionarios = new Funcionario[10];
        this.numFuncionarios = 0;
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios[numFuncionarios] = funcionario;
        numFuncionarios++;
    }
}