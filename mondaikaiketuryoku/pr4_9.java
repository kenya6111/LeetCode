package mondaikaiketuryoku;

import java.util.ArrayList;
import java.util.Scanner;

public class pr4_9 {

    public static boolean func(int i,int w,ArrayList<Integer> a){
        if(i ==0){
            return w==0;
        }

        //a[i-1]を選ばないとき
        if(func(i-1,w,a)){
            return true;
        }

        //a[i-1]を選ぶとき
        if(w >=a.get(i-1) && func(i - 1, w - a.get(i - 1), a)){
            return true;
        }

        return false;

    }
    public static void main(String[] args){
        System.out.println("aaa");
    Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int W = sc.nextInt();
       ArrayList<Integer> a = new ArrayList<>(N);
       for (int i = 0; i < N; ++i) {
           a.add(sc.nextInt());
       }
       sc.close();

       // 再帰的に解く
       if (func(N, W, a)) {
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }
    }
}
