package mondaikaiketuryoku;

import java.util.Scanner;

public class pr3_3 {
    public static void main(String[] args){
        System.out.println("aaa");


        int min_val=0;
        int[] test=new int[]{10,22,3,4,54,5,4,4,32,110};
        min_val=test[0];
        for(int i=1;i<test.length;i++){
            if(test[i] < min_val){
                min_val=test[i];
            }
            
        }

        System.out.println(min_val);
        
    }
}
