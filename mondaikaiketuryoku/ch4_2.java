package mondaikaiketuryoku;

import java.util.ArrayList;

public class ch4_2 {

    public static int fibo_memo(int n){

        if(n==0)return 0;
        if(n==1)return 0;
        if(n==2)return 1;

        ArrayList<Integer> a= new ArrayList<>(n);

        for(int i=0;i<n;i++){
            a.add(0);
        }

        a.set(0,0);
        a.set(1,0);
        a.set(2,1);

        for(int i=3;i<n;i++){
            a.set(i, a.get(i-1)+a.get(i-2)+a.get(i-3));
        }

        return a.get(n-1);
    }
    public static void main(String[] args) {

        System.out.println(fibo_memo(6));
        
    }
}
