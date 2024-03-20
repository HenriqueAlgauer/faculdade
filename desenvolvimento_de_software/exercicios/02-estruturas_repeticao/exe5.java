import java.util.Scanner;

class exe5 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int num = input.nextInt();
        int mult;
        for(int i=0;i<=10;i++){
            mult = num *i;
            System.out.printf("\n%d x %d = %d", num,i,mult);
        }

        input.close();
    }
}
