package mondaikaiketuryoku;

import java.util.Scanner;
import java.util.Arrays;


public class ch3_3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // 入力受け取り
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = scanner.nextInt();
        }

        
        //解法1 昇順にソートして２番目の値を取得
        // Arrays.sort(a);
        // System.out.println(a[1]);

        //解法2 線形探索
        int worstValue=Integer.MAX_VALUE;
        int secondWorstValue=Integer.MAX_VALUE;

        worstValue=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i] < worstValue){
                worstValue=a[i];
                secondWorstValue=worstValue;
            }
        }
        System.out.println(worstValue);
        System.out.println(secondWorstValue);




    }
}
