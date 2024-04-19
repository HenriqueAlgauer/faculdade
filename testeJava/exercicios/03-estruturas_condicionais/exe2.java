package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe um numero: ");
        int num = input.nextByte();
        
        System.out.printf("Antecessor: %d \nSucessor: %d",
        num-1, num + 1);
	
	input.close();
    }
}
