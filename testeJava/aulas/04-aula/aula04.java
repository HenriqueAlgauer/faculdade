class aula04 {
    public static void main(String[] args){

    }
}

class Cliente{
    public String nome;
    public String email;
    public String endereco;

    public Cliente(String nome, String email, String endereco){
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }
    public String getEmail() {
        return this.email;
    }
    public String getEndereco() {
        return this.endereco;
    }
}

class Pedido{
    int numeroPedido;
    double totalPedido;
    
}