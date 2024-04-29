using System;
public class Veiculo
{
    public string Marca { get; set; }
    public string Modelo { get; set; }

    // Construtor da classe Veiculo
    public Veiculo(string marca, string modelo)
    {
        Marca = marca;
        Modelo = modelo;
    }

    // Método para exibir informações básicas do veículo
    // public void ExibirInfo()
    // {
    //     Console.WriteLine($"Marca: {Marca}, Modelo: {Modelo}");
    // }
}