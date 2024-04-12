class Jogador{
    String nome;
    String posicao;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getPosicao() {
        return posicao;
    }

    public Jogador(String nome, String posicao){
        setNome(nome);
        setPosicao(posicao);
    }
}

class Time{
    String nome;
}

class aula06 {
    public static void main(String[] args){
        Jogador jg1 = new Jogador("Pato", "Atacante");

        System.out.println(jg1.nome);
        System.out.println(jg1.posicao);
    }
}