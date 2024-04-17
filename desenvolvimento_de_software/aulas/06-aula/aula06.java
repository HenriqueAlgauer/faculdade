class Jogador{
    public String nome;
    public String posicao;

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
    public String nome;
    public Jogador[] jogadoresTime;
    public int numJogador = 0;

    public Time(String nome){
        setNome(nome);
        this.jogadoresTime = new Jogador[11];
    }

    public void addJogador(Jogador jogador){
        this.jogadoresTime[numJogador] = jogador;
        numJogador++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}


class aula06 {
    public static void main(String[] args){


        




        Jogador jg1 = new Jogador("Pato", "Atacante");
        Jogador jg2 = new Jogador("Mosquito", "Bicheiro");

        Time tm1 = new Time("NPFC");

        tm1.addJogador(jg1);
        tm1.addJogador(jg2);

        for(int i =0;i<tm1.numJogador; i++){
            System.out.print(tm1.jogadoresTime[i].nome+ ": ");
            System.out.print(tm1.jogadoresTime[i].posicao + "\n");
        }
    }
}