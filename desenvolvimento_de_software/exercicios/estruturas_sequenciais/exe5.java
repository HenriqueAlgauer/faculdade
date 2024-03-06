package exercicios.estruturas_sequenciais;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o numero de cópias: ");
        int copias = input.nextInt();

        double valor_pagar = 0;

        if(copias <= 100){
            valor_pagar = copias * 0.25;
        }else{
            valor_pagar = (copias - 100) * 0.2 + 25; 
        }

        System.out.print("Valor a pagar: " + valor_pagar);
        input.close();
    }

}
