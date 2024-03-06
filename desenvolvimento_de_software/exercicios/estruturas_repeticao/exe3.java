
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int num = input.nextInt();
        int total = 0;
        for(int i=2;i<num;i +=2){
            System.out.print(i+"\n");
            total++;
        }
        System.out.print("Total: "+total);

        input.close();
    }
}
