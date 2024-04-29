//1 - Imagine uma pequena biblioteca pessoal, uma coleção que você começou a construir com seus livros favoritos. No entanto, com o tempo e o acúmulo de mais e mais livros, você percebe a necessidade de organizar e acessar rapidamente as informações de cada um deles.  
// Para ajudar nessa organização, você decide criar um sistema simples em Java que permitirá registrar cada livro com detalhes cruciais: o título, o autor e o ano de publicação. Além de armazenar esses dados, você quer uma maneira fácil de exibir as informações de qualquer livro da sua coleção, para quando quiser relembrar um título ou sugerir uma leitura a um amigo
class Livro{
    String titulo;
    String autor;
    int ano;

    public void status(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano: " + this.ano);
        System.out.println("");
    }
}

class pooexe01 {
    public static void main(String[] args){
        Livro l1 = new Livro();
        l1.titulo ="Livro 1";
        l1.autor = "John Doe";
        l1.ano = 2077;

        l1.status();
    }
}
