//Escreva um método que solicite ao usuário o nome e o preço de um produto e mostre uma mensagem baseada no seguinte exemplo: "Você comprou um produto (mouse) por R$ 185,00 e acaba de ganhar um desconto de 10%. Assim você vai pagar apenas R$ 166,50 pelo seu produto. Volte sempre!".
import java.util.Scanner;

class Compra{

    void desconto(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String produto = input.nextLine();

        System.out.print("Digite o nome do produto: ");
        double preco = input.nextDouble();

        System.out.print("Voce comprou um produto  por R$ " + produto + " e acaba de ganhar um desconto de 10%. Assim voce vai pagar apenas R$ " +preco*0.9 +" pelo seu produto. Volte sempre!");

        input.close();
    }
}

class exe04 {
    public static void main(String [] args){
        Compra c1 = new Compra();

        c1.desconto();
    }
}
