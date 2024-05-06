class Animal{
    String nome;
    int idade;

    public Animal(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public void mostrarInfo(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }

    public void emitirSom(){
        System.out.println("Som genérico de animal");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
}

class Gato extends Animal{

    public Gato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    public void emitirSom(){
        System.out.println("miau miau nigga!");
    }
}

class Dog extends Animal{
    String raca;

    public Dog(String nome, int idade, String raca){
        super(nome, idade);
        setRaca(raca);
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Raça: " + getRaca());
    }

    @Override
    public void emitirSom(){
        System.out.println("Au au!");
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getRaca() {
        return raca;
    }
}

public class aula09 {
    public static void main(String[] args){
        Animal gato = new Animal("Felix", 10);
        gato.emitirSom();
        
        Dog dog = new Dog("Ze", 5, "Vira lata");
        dog.emitirSom();
        dog.mostrarInfo();
    }   
}


