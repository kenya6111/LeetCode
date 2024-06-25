package mondaikaiketuryoku;

import java.util.Arrays;
import java.util.Scanner;

public class ch5_2 {
    static void chmin(long[] a, int i, long b) {
        if (a[i] > b) {
            a[i] = b;
        }
    }
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // long[] h = new long[N];
        // for (int i = 0; i < N; ++i) {
        //     h[i] = sc.nextLong();
        // }

        // // 初期化 (最小化問題なので INF に初期化)
        // long INF = 1L << 60; // 十分大きい値とする (ここでは 2^60)
        // long[] dp = new long[N];
        // Arrays.fill(dp, INF);

        // // 初期条件
        // dp[0] = 0;

        // // ループ
        // for (int i = 1; i < N; ++i) {
        //     chmin(dp, i, dp[i - 1] + Math.abs(h[i] - h[i - 1]));
        //     if (i > 1) {
        //         chmin(dp, i, dp[i - 2] + Math.abs(h[i] - h[i - 2]));
        //     }
        // }

        // // 答え
        // System.out.println(dp[N - 1]);
        int [] test = {2,9,4,5,1,6,10};

        int[] dp = new int[test.length];
        for(int i=0;i<test.length;i++){
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] =0;

        for(int i=1;i<test.length;i++){
            chinmin(dp, i, dp[i-1] + Math.abs(test[i] - test[i-1]));
            if(i >1){
                chinmin(dp, i, dp[i-2] + Math.abs(test[i] - test[i-2]));
            }
        }

        System.out.println(dp[6]);
    }
    static void chinmin (int[] a, int i, int  b){
        if(a[i] > b){
            a[i] = b;
        }
    }
}
