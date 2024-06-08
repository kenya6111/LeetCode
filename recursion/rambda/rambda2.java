package recursion.rambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class rambda2 {
    public static void main(String[] args) {
        // Javaには、ラムダ関数を定義するためのライブラリが付属しています。ラムダ式を保存するか、出力や入力として渡す必要があります。
        // その一つが、零項関数（引数を取らない関数）を表し、データを返す「Supplier」型と呼ばれるものです。この「Supplier」はデータを供給します。
        Supplier<String> lambda1 = () -> { return "A new world";};
        System.out.println(lambda1.get());

        Supplier<Integer> lambda2 = () ->{
            return 22 + 12;
        };
        System.out.println(lambda2.get());

        Integer p = 10;
        Supplier<Integer> lambda3= () -> 10 + p; //式が一行だけで完結する場合は return キーワードを省略できます
        System.out.println(lambda3.get());

        Function<Integer,Integer> squaredF = (x) -> {return x*x;};
        System.out.println(squaredF.apply(11));

        Function<Integer,Integer> squaredF2 = (x) -> {
            int res = x*x;
            return res*100;
        };
        System.out.println(squaredF2.apply(11));
        System.out.println("squaring......" + squaredF2.apply(11));


        Function<Integer, Integer> innerObj = new Function<Integer, Integer>(){
            public Integer apply(Integer x) {
               // pはこの匿名関数のスコープ外でアクセスされます。
                return x + p;
            }
        };
        System.out.println();
        System.out.println("Method defined through an anonymous class..." + innerObj.apply(10));
    }
}
