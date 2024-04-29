//Escreva um método que receba o nome e as 3 notas de um aluno e mostre o nome do aluno e a sua média aritmética.

class Aluno {
    String nome;
    float nota1;
    float nota2;
    float nota3;

    public void media(){
        float notaMedia = (this.nota1 + this.nota2 + this.nota3)/3;
        System.out.println("Media: "+ notaMedia);
    }
}

class exe01{
    public static void main(String[] args){
        Aluno a1 = new Aluno();
        a1.nota1 = 10;
        a1.nota2 = 5;
        a1.nota3 = 6;

        a1.media();
    }
}