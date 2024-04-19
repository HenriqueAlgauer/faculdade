package exercicios.estruturas_condicionais;

import java.util.Scanner;

public class exe6 {
public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do saque: ");
        int valor_saque = input.nextInt();

        System.out.println("Notas de 100: " + valor_saque/100);
        valor_saque %= 100;

        System.out.printf("Notas de 50: %d", valor_saque / 50);
        valor_saque %= 50;

        System.out.println("\nNotas de 25: " + valor_saque/25);
        valor_saque %=25;

        System.out.println("Notas de 10: " + valor_saque/10);
        valor_saque %=10;

        System.out.println("Notas de 5: " + valor_saque/5);

        input.close();
    }
}
