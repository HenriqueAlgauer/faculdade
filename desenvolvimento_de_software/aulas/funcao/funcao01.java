public class funcao01 {
    public static void linha(int qnt, char caractere){
        for(int i = 0; i < qnt; i++){
            System.out.print(caractere);
        }
    }
    public static void main(String[]args){
        
        linha(5, '|');
        System.out.print("");        
    }
}
