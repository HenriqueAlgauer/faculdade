public class Contatos {
    private String nome;
    private String telefone;

    public Contatos(String nome, String telefone){
        setNome(nome);
        setTelefone(telefone);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }


    @Override
    public String toString(){
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}
