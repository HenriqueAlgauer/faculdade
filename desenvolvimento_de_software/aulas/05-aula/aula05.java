class aula05 {
    public static void main(String[] args){
        Funcionario funcionario1 = new Funcionario("Joao", "Dev");
        Funcionario funcionario2 = new Funcionario("Maria", "Xerente");

        Departamento departamento1 = new Departamento("TI");
        Departamento departamento2 = new Departamento("RH");

        departamento1.addFuncionario(funcionario1);
        departamento2.addFuncionario(funcionario2);
        
        Empresa empresa1 = new Empresa("UP");
        empresa1.addDepartamento(departamento1);
    }   
}

class Funcionario{
    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
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

    public void mostrarInformacoes(){
        System.out.println("Departamento: " + this.nome);
        for(int i = 0; i < numFuncionarios; i++){

        }
    }
}


class Empresa{
    private String nome;
    private Departamento[] departamentos;
    private int numDepartamentos;

    public Empresa(String nome){
        this.nome = nome;
        this.departamentos = new Departamento[10];
        this.numDepartamentos = 0;
    }

    public void addDepartamento(Departamento departamento){
        departamentos[numDepartamentos] = departamento;
        numDepartamentos++;
    }

    public void mostrarInformacoes(){
        System.out.println("Empresa: " + this.nome);
        for(int i = 0; i<numDepartamentos; i++){
            departamentos[i].mostrarInformacoes();
        }
    }
}