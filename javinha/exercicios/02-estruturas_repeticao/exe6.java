class exe6 {
    public static void main(String[]args){
        int atual = 1;
        int anterior = 1;
        System.out.printf( anterior+ " " + atual);
        for(int i =0; i<11;i++){
            //int novo = atual + anterior;
            int aux = atual;
            atual += anterior;
            System.out.printf(" %d ", atual);
            
            anterior = aux;
        }
    }
}
