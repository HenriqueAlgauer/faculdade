package desenvolvimento_de_software.exercicios.estruturas_sequenciais;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = input.nextInt();       

        if(num % 2 == 0 && num % 7 == 0){
            System.out.printf("O numero %d é divisível por 2 e 7", num);
        }else if(num % 2 == 0 || num % 7 == 0){
            if(num % 2 == 0){
                System.out.printf("O numero %d é divisível por 2", num);
            }else{
                System.out.printf("O numero %d é divisível por 7", num);
            }
        }else{
            System.out.printf("O numero %d não é divisível por 2 e por 7", num);
        }
        input.close();
    }    
}
