package desenvolvimento_de_software.exercicios.estruturas_sequenciais;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();       

        if(num % 2 == 0 && num % 3 == 0){
            System.out.printf("O numero %d é divisível por 2 e 3", num);
        }else{
            System.out.printf("O numero %d não é divisível por 2 e 3", num);
        }
        input.close();
    }    
}
