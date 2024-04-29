// Crie uma classe que modele uma bomba de combustível. A classe deve possuir os seguintes atributos: número da bomba, tipo de combustível, valor do litro de combustível e quantidade de combustível. Os métodos são os seguintes:

// - abastecerPorValor( ): método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo.

// - abastecerPorLitro( ): método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.

// - alterarValor( ): altera o valor do litro do combustível.

// - alterarQuantidadeCombustivel( ): altera a quantidade de combustível restante na bomba.

// - status(): mostra o dados da bomba de combustível.
class Bomba{
    int id;
    String tipoBomba;
    double preco = 0;
    float litrosNaBomba = 0;

    void abastecerPorValor(float valor){
        double litrosAbastecidos = valor / this.preco;

        if(this.litrosNaBomba - litrosAbastecidos <= 0){
            System.out.print("Reabasteça a bomba !");
        }else if(this.preco == 0){
            System.out.print("Por favor insira o valor do combustivel");
        }else{
            System.out.printf("Litros abastecidos: %.2f", litrosAbastecidos);
            System.out.printf("\n");
        }
    }

    void abastecerPorLitro(float litros){
        if(this.litrosNaBomba - litros <= 0){
            System.out.println("Reabasteça a bomba !");
        }else if(this.preco == 0){
            System.out.println("Por favor insira o valor do combustivel");
        }else{
            double valorPagar = litros * this.preco;
            System.out.println("Valor a pagar: " + valorPagar);
        }
    }

    void alterarValor(float valorNovo){
        this.preco = valorNovo;
    }

    void status(){
        System.out.println("\nNúmero da bomba: " + this.id);
        System.out.println("Combustível: " + this.tipoBomba);
        System.out.println("Valor combustível: " + this.preco);
        System.out.println("Litros restantes na bomba: " + this.litrosNaBomba);
    }
}

public class exe0003 {
    public static void main(String[] args){
        Bomba b1 = new Bomba();
        b1.id = 01;
        b1.tipoBomba = "Diesel";
        b1.preco = 5.69;
        b1.litrosNaBomba = 140;

        b1.abastecerPorLitro(100); //
        b1.abastecerPorValor(500);
        
        b1.alterarValor(5);
        b1.abastecerPorValor(500);

        b1.status();

    }
}
