class CartaoCredito : IMetodoPagamento
{
    public string NumeroCartao { get; set; }

    public CartaoCredito(string numeroCartao)
    {
        NumeroCartao = numeroCartao;
    }

    public bool Pagamento(decimal quantia)
    {
        Console.WriteLine($"Processando pagamento de {quantia:C} via cartão de crédito.");
        return true;
    }

    public string VerificarStatus()
    {
        return "Pagamento aprovado.";
    }
}

class BoletoBancario : IMetodoPagamento
{
    public string CodigoBoleto { get; set; }

    public BoletoBancario(string codigoBoleto)
    {
        CodigoBoleto = codigoBoleto;
    }

    public bool Pagamento(decimal quantia)
    {
        Console.WriteLine($"Boleto emitido no valor de {quantia:C}. Código do boleto: {CodigoBoleto}");
        return true;
    }

    public string VerificarStatus()
    {
        return "Boleto emitido, aguardando pagamento.";
    }
}

class TransferenciaBancaria : IMetodoPagamento
{
    public string ContaBancaria { get; set; }

    public TransferenciaBancaria(string contaBancaria)
    {
        ContaBancaria = contaBancaria;
    }

    public bool Pagamento(decimal quantia)
    {
        Console.WriteLine($"Realizando transferência de {quantia:C} para a conta {ContaBancaria}.");
        return true;
    }

    public string VerificarStatus()
    {
        return "Transferência realizada com sucesso.";
    }
}

public class Program{
    public static void Main(string[] args){

    }
}