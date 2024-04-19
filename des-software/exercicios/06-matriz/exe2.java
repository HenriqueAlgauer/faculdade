class exe002 {
    public static void main(String[] args){
        int matriz[][] = new int[5][5];
        int soma = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = i+5;
            }           
        }

        for(int i = 0; i < matriz.length; i++){
            soma += matriz[3][i];    
        }
        System.out.print("Soma: " + soma);      
    }
}