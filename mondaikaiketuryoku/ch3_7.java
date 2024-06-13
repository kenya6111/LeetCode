package mondaikaiketuryoku;

import java.util.Scanner;

public class ch3_7 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();

        // N-1 箇所の隙間に「+」を入れるかどうかをすべて試す
        long res = 0;
        for (int bit = 0; bit < (1 << (N - 1)); ++bit) {
            // tmp：「+」と「+」との間の値を表す変数
            long tmp = 0;
            for (int i = 0; i < N - 1; ++i) {
                tmp *= 10;
                tmp += S.charAt(i) - '0';

                // 「+」を挿入するとき、答えに tmp を加算して、tmp を 0 に初期化
                if ((bit & (1 << i)) != 0) {
                    res += tmp;
                    tmp = 0;
                }
            }

            // 最後の「+」から残りの部分を答えに加算
            tmp *= 10;
            tmp += S.charAt(N - 1) - '0';
            res += tmp;
        }


        System.out.println(res);
    }
}
