package exercicios.estruturas_sequenciais;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int um = input.nextInt();       
        System.out.print("Segundo numero: ");
        int dois = input.nextInt();

        int num = um;
        if(num > dois){
            System.out.printf("%d ,%d", dois, um);
        }else{
            System.out.printf("%d, %d", um, dois);
        }
        input.close();
    }    
}
