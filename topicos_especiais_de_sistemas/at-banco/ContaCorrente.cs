public class ContaCorrente : IContaBancaria{
    int numConta {get;set;}
    double saldo {get;set;}


    public ContaCorrente(int numConta,double saldo){
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void Depositar(double valor){
        Console.WriteLine("Você depositou: "+valor);
    }

    public void Sacar(double valor){
        Console.WriteLine("Você sacou"+valor);
        this.saldo -= valor;
        if(this.saldo < valor){
            Console.WriteLine("Saldo insuficiente");
        }else{
            this.saldo -= valor;
            Console.WriteLine($"Saque de ${valor} efetuado !");
        }
    }
}   