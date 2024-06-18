package mondaikaiketuryoku;

public class pr4_1 {
    public static int func(int N){
            // 再帰関数を呼び出したことを報告する
            System.out.println("func(" + N + ") を呼び出しました");
            if (N == 0) return 0;
            // 再帰的に答えを求めて出力する
            int result = N + func(N - 1);
            System.out.println(N + " までの和 = " + result);
            return result;
    }

    public static int func2(int n){

        if(n==0)return 0;
        int result= n + func2(n-1);
        System.out.println(n+"までの総和は、、"+result);
        return result;

    }
    public static void main(String[] args){
        System.out.println("aaa");
        func(5);
        func2(3);

     }
}
