package mondaikaiketuryoku;

import java.util.Arrays;
import java.util.Scanner;

public class ch5_1 {
       public static void main(String[] args) {
        // 入力
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // long[] h = new long[N];
        // for (int i = 0; i < N; ++i) {
        //     h[i] = sc.nextLong();
        // }

        // // 配列 dp を定義 (配列全体を無限大を表す値に初期化)
        // long INF = 1L << 60; // 十分大きい値とする (ここでは 2^60)
        // long[] dp = new long[N];
        // Arrays.fill(dp, INF);

        // // 初期条件
        // dp[0] = 0;

        // // ループ
        // for (int i = 1; i < N; ++i) {
        //     if (i == 1) {
        //         dp[i] = Math.abs(h[i] - h[i - 1]);
        //     } else {
        //         dp[i] = Math.min(dp[i - 1] + Math.abs(h[i] - h[i - 1]),
        //                          dp[i - 2] + Math.abs(h[i] - h[i - 2]));
        //     }
        // }

        // // 答え
        // System.out.println(dp[N - 1]);


        int [] test = {2,9,4,5,1,6,10};

        int[] dp = new int[test.length];
        dp[0] = 0;
        

        for(int i=1;i<test.length;i++){
            if(i ==1){
                dp[i] = Math.abs(test[i]-test[i-1]);
            }else{
                dp[i] = Math.min(dp[i-1] + Math.abs(test[i] - test[i-1])  ,dp[i-2] + Math.abs(test[i] - test[i-2]));
            }

        }
        System.out.println(dp[0]);
        System.out.println(dp[1]);
        System.out.println(dp[2]);
        System.out.println(dp[3]);
        System.out.println(dp[4]);
        System.out.println(dp[5]);
        System.out.println(dp[6]);

    }
}
