import java.util.Scanner;

class exe8 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        float num;

        System.out.print("Digite um numero: ");
        float menor = input.nextFloat();
        float maior = menor;

        do{
            System.out.print("Digite um numero: ");
            num = input.nextFloat();
            if(num == 0){
                break;
            }else if(num > maior){
                maior = num;
            }else if(num < menor){
                menor = num;
            }

        }while(num !=0);

        float amplitude = maior - menor;

        System.out.print("Amplitude: " + amplitude);

        input.close();
    }
}
