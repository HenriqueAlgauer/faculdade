class Livro{
    public String nome;
    public String autor;
    //public int ano;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    // public void setAno(int ano) {
    //     this.ano = ano;
    // }
    // public int getAno() {
    //     return ano;
    // }

    public Livro(String nome, String autor){
        setNome(nome);
        setAutor(autor);
        //setAno(ano);
    }
}

class Bib{
    public String nome;
    public Livro[] livrosBib;
    public int numLivros = 0;

    public Bib(String nome){
        setNome(nome);
        this.livrosBib = new Livro[11];
    }

    public void addLivro(Livro livro){
        this.livrosBib[numLivros] = livro;
        numLivros++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

class aula06exe2 {
    public static void main(String[] args){
        Livro lv1 = new Livro("lv01", "pangua");
        Bib bb1 = new Bib("Lib01");

        bb1.addLivro(lv1);

        // for(int i =0;i<bb1.numLivros; i++){
        //     System.out.print(bb1.livrosBib[i].nome+ ": ");
        //     System.out.print(bb1.livrosBib[i].autor + ": ");
        //     //System.out.print(bb1.livrosBib[i].ano + "\n");
        // }
    }
}
