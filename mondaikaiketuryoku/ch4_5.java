package mondaikaiketuryoku;

import java.util.Scanner;

public class ch4_5 {

    public static void func(long N, long cur, int use, long[] counter) {
        if (cur > N) return; // ベースケース
        if (use == 0b111) ++counter[0]; // 答えを増やす

        // 7 を付け加える
        func(N, cur * 10 + 7, use | 0b001, counter);

        // 5 を付け加える
        func(N, cur * 10 + 5, use | 0b010, counter);

        // 3 を付け加える
        func(N, cur * 10 + 3, use | 0b100, counter);
    }
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long[] counter = {0};
        // func(N, 0, 0, counter);
        // System.out.println(counter[0]);
        // test(N,0,0,counter);
        // System.out.println(counter[0]);

        String[] test ={"a"};

        test2(test);
        System.out.println(test);



    }

    //上記のfuncのメソッドを一度自分で実装してみる。
    public static void test(long N, long cur, int use, long[] counter){

        if(cur > N)return;

        if(use == 0b111 ) counter[0]++;
        //7を追加する
        test(N,cur*10+7, use | 0b001, counter);
        //5を追加する
        test(N,cur*10+5, use | 0b010, counter);
        //3を追加する
        test(N,cur*10+3, use | 0b100, counter);
    }

    public static void test2(String[] test){

        for(int i=0;i<10;i++){
            test[0] +=Integer.toString(i);
        }

    }
}


//気づけなかったこと
// 5,3,7を各桁でつかったかどうかを、２進数３桁分で表し、２進数３桁がすべて１になれば７，５，３すべて使ったという判定処理にしている。
// 再帰処理では、再帰関数の外にcounterをおいて、参照渡しで再帰関数に渡している。
// use | 0b001とか use| 0b010とか use | 0b100で,7,5,3を使ったかどうかの判定を記録している。



//学びになったこと