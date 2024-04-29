public class ContaPoupanca : IContaBancaria{
    int numConta {get;set;}
    double saldo {get;set;}

    public void Depositar(double valor){
        Console.WriteLine("Você depositou: "+valor);
        this.saldo += valor;
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