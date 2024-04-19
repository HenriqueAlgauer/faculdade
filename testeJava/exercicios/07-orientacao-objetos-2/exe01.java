//Crie uma classe que modele uma conta corrente. A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. Os métodos são os seguintes: depósito e saque. O saldo deve ser definido inicialmente com 0 (zero). A cada deposito ou saque efetuado deve ser mostrado o nome do correntista e o saldo atualizado.
import java.util.Scanner;

class Conta{
    Scanner input = new Scanner(System.in);
    int conta;
    String nome;
    float saldo = 0;

    void deposito(){

        System.out.print("Valor para depósito: ");
        float valorDeposito = input.nextFloat();
        
        this.saldo += valorDeposito;

        System.out.println("Nome correntista: " + this.nome);
        System.out.println("Saldo: $" + this.saldo + "\n");
    }

    void saque(){

        System.out.print("Valor para saque: ");
        float valorSaque = input.nextFloat();
        
        this.saldo -= valorSaque;

        System.out.println("Nome correntista: " + this.nome);
        System.out.print("Novo saldo: $" + this.saldo);
    }
}

class exe0001 {
    public static void main(String[] args){
        Conta ct1 = new Conta();
        ct1.nome = "Pedro";

        ct1.deposito();
        ct1.saque();
    }
}
