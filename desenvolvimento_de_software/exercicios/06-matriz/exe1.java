class exe1 {
    public static void main(String[] args){
        int matriz[][] = new int[2][3];
        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = (i + j) * 2;
            }           
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                soma += matriz[i][j];
            }    
        }
        System.out.print("Soma: " + soma);      
    }
}