class Contatos {
    private String nome;
    private String telefone;
 
    /* Construtor da classe Contato */
    public Contatos(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
 
    /* Métodos para obter os atributos do contato */
    public String getNome() {
        return nome;
    }
 
    public String getTelefone() {
        return telefone;
    }
 
    /* Métodos para definir os atributos do contato */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
 
    /* Sobrescreve o método toString para retornar uma representacao em string do contato */
    @Override
    public String toString() {
        return "Nome: " + nome + ", Telefone: " + telefone;
    }
}