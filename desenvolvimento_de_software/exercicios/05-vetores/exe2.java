public class exe2 {
    public static void main(String[] args){
        float[] numbers = {1,1,1,10,100};
        float soma = 0;

        for(int i = 0; i < numbers.length; i++){
            soma += numbers[i];
        }
        
        double media = soma/numbers.length;
        System.out.printf("Media: %.2f", media);
    }
}
