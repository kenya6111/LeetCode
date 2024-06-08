package recursion.rambda;
import java.util.function.*;


public class rambda3 {
    public static void main(String[] args) {
        BiFunction<Function<Integer,?> ,Integer,? > fSquaredX = (f, x) -> f.apply(x*x);
        System.out.println(fSquaredX.apply(a -> a+30,5));

        System.out.println(fSquaredX.apply(a -> a+100,10));

         // 呼び出し可能オブジェクトを変数に格納します。
         Function<Integer, String> callable = p -> "p is " + p;

         // 「Integer を受け取って String を返す Function」 を fSquaredX の引数に渡す例
         System.out.println(fSquaredX.apply(callable, 10)); // p is 100
         System.out.println(fSquaredX.apply(callable, 8)); // p is 64
         Function<Integer, Integer> testFn = p ->p+p;
         System.out.println(fSquaredX.apply(testFn, 10));


         // ? を使用しない場合
        // - Integer を受け取ってInteger を返す Function
        // - Integer
        // この二つの引数を受け取って Integer を返す BiFunction
        BiFunction<Function<Integer, Integer>, Integer, Integer> fSquaredXInt = (f, x) -> f.apply(x*x);
        System.out.println(fSquaredXInt.apply(a -> a + 30, 5)); // 25 + 30 = 55

        Consumer<String> consumer = (x)-> System.out.println(x+"!!!!!!!!!!!!!!!!");
         consumer.accept("最後まで読んで頂きありがとうございます。");


         // - Integer を受け取って戻り値がない Consumer
        // - Integer
        // この二つの引数を受け取って 戻り値がない BiConsumer
        // Consumer は accept(引数) で実行されます
        BiConsumer<Consumer<Integer>, Integer> fSquaredXConsumer = (f, x) -> f.accept(x*x);

        // 呼び出し可能オブジェクトを変数に格納します。
        Consumer<Integer> callableP = p -> System.out.println("p is " + p);

        fSquaredXConsumer.accept(callableP, 10); // p is 100
        fSquaredXConsumer.accept(callableP, 8); // p is 64



    }
}
