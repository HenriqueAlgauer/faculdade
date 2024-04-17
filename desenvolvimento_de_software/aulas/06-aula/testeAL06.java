public class testeAL06 {
    public  static void main(String[] args){
        Autor autor1 = new Autor("jose", 54);
        Autor autor2 = new Autor("bibo", 68);


        System.out.println(autor1.nome);

    }
}

class Autor{
    public String nome;
    public int idade;

    public Autor(String nome, int idade){
        setNome(nome);
        setIdade(idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }
}
class Livro{ 
    public String titulo;
    public int anoPub;
    public Autor autor;
}


