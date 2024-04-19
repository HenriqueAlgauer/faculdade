class exe003 {
    public static void main(String[] args){
        int matriz[][] = new int[5][5];
        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = i;
            }           
        }

        int menor = matriz[0][0];    
        
        for(int i = 0; i < matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(menor > matriz[i][j]){
                    menor = matriz[i][j];
                }
                soma += matriz[i][j];
            }    
        }

        double media = soma / 25;
        System.out.println("Soma: " + soma);      
        System.out.println("Media: " + media);      
        System.out.println("Menor: " + menor);      
    }
}