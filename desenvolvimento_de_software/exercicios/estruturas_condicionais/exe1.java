package desenvolvimento_de_software.exercicios.estruturas_condicionais;

import java.util.Scanner;

class exe1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe horas: ");
        byte hora = input.nextByte();
        
        System.out.print("Informe minutos: ");
        byte min = input.nextByte();
        
        System.out.print("Informe segundos: ");
        byte seg = input.nextByte();
        
        int total = hora * 3600 + min * 60 + seg;
        
        System.out.print("Total de horas: " + total);
        
        input.close();
    }
}
