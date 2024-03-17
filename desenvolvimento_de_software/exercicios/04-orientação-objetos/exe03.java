// Escreva um método que calcule e retorne o valor da conta de energia a ser paga de acordo com a quantidade de Kw consumidos, sendo que o valor do Kw é 0,60 (pessoa física), 0,48 (comércio) e 1,29 (indústria).

class ContaDeLuz{
    double valorPagar;

    float calculaValor(int tipoConta, int kws){
        switch(tipoConta){
            case 1: 
                this.valorPagar = kws * 0.6;break;
            case 2: 
                this.valorPagar = kws * 0.48;break;
            case 3: 
                this.valorPagar = kws * 1.29;break;
            default: System.out.print("Insira um valor válido: \n1-(PF) \n2-(Comércio) \n3-(Indústria)");
        }

        return 0;
    }
}

public class exe03 {
    public static void main(String[] args){
        ContaDeLuz c1 = new ContaDeLuz();

        c1.calculaValor(1, 100);
        System.out.print(c1.valorPagar);
    }
}
