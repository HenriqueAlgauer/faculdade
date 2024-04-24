package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de latas: ");
        int lata = input.nextInt();
        
        System.out.print("Informe a quantidade de garrafinhas: ");
        int garrafa600 = input.nextInt();
        
        System.out.print("Informe a quantidade de garrafas: ");
        int garrafa2l = input.nextInt();
        
        
        
        float litros = lata * 0.35f + garrafa600 * 0.6f + garrafa2l * 2;
        
        System.out.printf("Total de litros: %.2f", litros);
        
        input.close();
        
    }
}
