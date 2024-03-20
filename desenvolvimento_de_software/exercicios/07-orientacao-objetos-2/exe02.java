class Pessoaa{
    String nome;
    int idade ;
    int altura ;
    float peso;

    void envelhecer(){
        if(idade == 0){
            System.out.print("Declare um valor para idade.");
        }else if(idade <21){
            this.idade ++;
            this.altura ++;
        }else{
            this.idade ++;
        }
    }

    void engordar(float qntKg){
        if(peso == 0){
            System.out.print("Declare um valor para peso.");
        }else{
            this.peso += qntKg;
        }
    }

    void emagrecer(float qntKg){
        if(peso == 0){
            System.out.print("Declare um valor para peso.");
        }else{
            this.peso -= qntKg;
        }
    }
}

class exe0002 {
    public static void main(String[] args){
        Pessoaa predo = new Pessoaa();
    
        predo.idade = 10;
        predo.altura = 110;
        predo.peso = 30;

        System.out.println(predo.idade);
        System.out.println(predo.altura);
        
        predo.envelhecer();
        predo.envelhecer();
   
        System.out.println(predo.idade);
        System.out.println(predo.altura);
    }
}
