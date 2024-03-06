package exercicios.estruturas_sequenciais;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int um = input.nextInt();       
        System.out.print("Segundo numero: ");
        int dois = input.nextInt();
        System.out.print("Terceiro numero: ");
        int tres = input.nextInt();

        int menor = um;
        if(menor > dois){
            menor = dois;
        }
        if(menor > tres){
            menor = tres;
        }

        System.out.print("Menor numero: " + menor);
        input.close();
    }    
}
