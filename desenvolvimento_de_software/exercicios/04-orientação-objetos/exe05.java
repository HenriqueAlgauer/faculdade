//Escreva um método que retorne o maior valor entre três números inteiros.
class Numeros{
    int maior;

    int maiorValor(int num1, int num2, int num3){
        this.maior = num1;

        if(this.maior < num2){
            this.maior = num2;
        }
        if(this.maior < num3){
            this.maior = num3;
        }

        return this.maior;
    }
}

public class exe05 {
    public static void main(String[] args){
        Numeros n1 = new Numeros();

        n1.maiorValor(90, 20, 30);
        System.out.print("Maior número: " + n1.maior);
    }
}
