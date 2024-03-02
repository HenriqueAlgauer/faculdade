package desenvolvimento_de_software.exercicios.estruturas_condicionais;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Capacidade do tanque: ");
        int capacidade = input.nextInt();

        System.out.print("Litros abastecidos: ");
        int litros_abastecidos = input.nextInt();

        System.out.print("Quilometragem percorrida: ");
        int km_percorrido = input.nextInt();

        float consumo_medio = km_percorrido / litros_abastecidos;

        float autonomia = (capacidade - litros_abastecidos) * consumo_medio;

        System.out.printf("Consumo medio: %.1f \nAutonomia do veiculo: %.1f",consumo_medio,autonomia);


        input.close();
    }    
}
