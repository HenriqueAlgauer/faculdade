class exe2 {
    public static void main(String[] args){
        float[] numbers = {20,1,17,10,20};
        float soma = 0;

        for(int i = 0; i < numbers.length; i++){
            soma += numbers[i];
        }
        
        double media = soma/numbers.length;
        System.out.printf("Media: %.2f", media);
        System.out.println("\nNumeros maiores ou igual a media: ");
        
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] >= media){
                System.out.print(numbers[i]+" | ");
            }
        }
    }
}
