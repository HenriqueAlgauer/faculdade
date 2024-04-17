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



class aula06 {
    public static void main(String[] args){


        Autor autor1 = new Autor("jose", 54);
        Autor autor2 = new Autor("bibo", 68);


        System.out.println(autor1.nome);




        // Jogador jg1 = new Jogador("Pato", "Atacante");
        // Jogador jg2 = new Jogador("Mosquito", "Bicheiro");

        // Time tm1 = new Time("NPFC");

        // tm1.addJogador(jg1);
        // tm1.addJogador(jg2);

        // for(int i =0;i<tm1.numJogador; i++){
        //     System.out.print(tm1.jogadoresTime[i].nome+ ": ");
        //     System.out.print(tm1.jogadoresTime[i].posicao + "\n");
        // }
    }
}