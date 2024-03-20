import java.util.Scanner;

class exe3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        boolean encontrado = false;
        float[] numbers = {20,1,17,10,20};
        
        System.out.print("Digite um numero: ");
        float num = input.nextFloat();

        for(int i = 0; i < numbers.length;i++){
            if(numbers[i] == num){
                System.out.printf("Número: %.1f encontrado no índece [%d] do vetor 'numbers' ", num, i);
                encontrado = true;
            }
        }
        if(encontrado == false){
            System.out.print("Numero nao encontrado no vetor");
        }
        input.close();
    }
}
