import java.util.Scanner;

public class exe4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        int num;
        int soma = 0;
        do{
            System.out.print("Digite um numero: ");
            num = input.nextInt();
            soma += num;

        }while(num != 0);
        System.out.print("\nSoma: "+soma);
        input.close();
    }
}
