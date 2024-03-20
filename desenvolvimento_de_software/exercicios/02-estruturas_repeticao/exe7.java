class test {
    public static void main(String[] args){
        float maior = 100;
        float menor = 1 ;
        System.out.printf("%.0f %.0f \n", maior, menor);

        float soma=0;
        for(int i =0; i <100; i++){
            System.out.printf("%.0f , %.0f \n", maior, menor);
            
            soma = soma + menor/maior;
            
            menor++;
            maior--;
        }
        System.out.printf("Soma: %f", soma);
    }
}
