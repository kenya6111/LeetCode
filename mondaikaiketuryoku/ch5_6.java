package mondaikaiketuryoku;

import java.util.Arrays;
import java.util.Scanner;

public class ch5_6 {
      // グローバル変数として入力データとメモ用のDPテーブルを定義
      static int N;
      static long[] h;
      static long[] dp;
      static final long INF = 1L << 60; // 十分大きい値とする (ここでは 2^60)

      // 最小値を更新するヘルパーメソッド
      static void chmin(long[] a, int i, long b) {
          if (a[i] > b) {
              a[i] = b;
          }
      }

      // 再帰的に最小コストを計算するメソッド
      static long rec(int i) {
          // DPの値が更新されていたらそのままリターン
          if (dp[i] < INF) return dp[i];

          // ベースケース: 足場0のコストは0
          if (i == 0) return 0;

          // 答えを表す変数をINFで初期化する
          long res = INF; 

          // 足場i - 1から来た場合
          res = Math.min(res, rec(i - 1) + Math.abs(h[i] - h[i - 1]));

          // 足場i - 2から来た場合
          if (i > 1) {
              res = Math.min(res, rec(i - 2) + Math.abs(h[i] - h[i - 2]));
          }

          // 結果をメモしながら、返す
          dp[i] = res;
          return res;
      }
      public static void main(String[] args) {
        // 入力受け取り
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        h = new long[N];
        for (int i = 0; i < N; ++i) {
            h[i] = sc.nextLong();
        }

        // 初期化 (最小化問題なので INF に初期化)
        dp = new long[N];
        Arrays.fill(dp, INF);

        // 答え
        System.out.println(rec(N - 1));
    }
}
