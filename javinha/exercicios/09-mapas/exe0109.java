import java.util.List;
import java.util.ArrayList;

public class exe0109 {
    public static void main(String[] args){

        int nums[] = {1,10,20,21,30,40,50};

        List<Integer> numeros = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            numeros.add(nums[i]);
        }

        if(numeros.contains(30)){
            System.out.println("Tem 30 ");
        }else{
            System.out.println("não tem 30 ");
        }
        if(numeros.contains(15)){
            System.out.println("tem 15 ");
        }else{
            System.out.println("não tem 15 ");
        }

        numeros.add(60);
        
        
                
    }
}
