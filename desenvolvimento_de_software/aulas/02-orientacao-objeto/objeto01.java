class Pessoa {
    String nome;
    int idade;
    boolean falando = false;
    boolean comendo = false;

    public void status() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Falando: " + this.falando);
        System.out.println("Comendo: " + this.comendo);

    }

    public void falar() {
        if (this.falando == true){
            System.out.println(this.nome + " já esta falando");
        }else{
            this.falando = true;
            System.out.println(this.nome + " está falando");
        }        
    }

    public void pararDeFalar(){
        if(this.falando == false){
            System.out.println(this.nome + " não está falando");
        }else{
            System.out.println(this.nome + " parou de falar");
        }
        this.falando = false;
        System.out.println(this.nome + " ja parou de falar");
    }

    public void comer(String alimento){
        if(this.falando == true){
            System.out.println(this.nome + " não pode comer, pois está falando");
        }
        else if(this.comendo == true){
            System.out.println(this.nome + " já está comendo" + alimento);
        }else{
            this.comendo = true;
            System.out.println(this.nome + " está comendo" + alimento);
        }
    }
}

class objeto01 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Marcelo";
        p1.idade = 55;

        Pessoa p2 = new Pessoa();
        p2.nome = "John Doe";
        p2.idade = 89;
        p2.falando = true;

        p1.status();
        p2.status();

        p2.falar();
    }
}
