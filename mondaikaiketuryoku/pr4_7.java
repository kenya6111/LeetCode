package mondaikaiketuryoku;

import java.util.ArrayList;

public class pr4_7 {

    public static void main(String[] args) {
        ArrayList<Long> F = new ArrayList<>(50);
        // リストを50要素で初期化
        // for (int i = 0; i < 50; i++) {
        //     F.add(0L);
        // }

        // F.set(0, 0L);
        // F.set(1, 1L);

        // for (int N = 2; N < 50; ++N) {
        //     F.set(N, F.get(N - 1) + F.get(N - 2));
        //     System.out.println(N + " 番目: " + F.get(N));
        // }



        System.out.println(func(7));
    }

    public static int func (int n){

        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer.");
        }

        if (n == 1) {
            return 0; // フィボナッチ数列の最初の値
        }

        if (n == 2) {
            return 1; // フィボナッチ数列の2番目の値
        }

        ArrayList<Integer> darr = new ArrayList<>(n);
        for(int i=0; i<n;i++){
            darr.add(0);
        }
        darr.set(0,0);
        darr.set(1,1);

        for(int i=2; i<n ;i++){
            darr.set(i, darr.get(i-1)+darr.get(i-2));
        }

        return darr.get(n-1);

    }
}
