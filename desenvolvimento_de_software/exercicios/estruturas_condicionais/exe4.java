package desenvolvimento_de_software.exercicios.estruturas_condicionais;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quilômetros percorridos: ");
        int km_percorrido = input.nextInt();       
        System.out.print("Dias de aluguel: ");
        int dias = input.nextInt();

        double total = km_percorrido * 0.15 + dias * 70;

        System.out.print("Total a pagar: " + total);

        input.close();
    }    
}   
