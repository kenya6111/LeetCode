package recursion.rambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class advancedFunction {
    public static Runnable createPrintFn(String word) {
        return new Runnable() {
            public void run() {
                System.out.println(word);
            }
        };
    }

     // 呼び出し可能オブジェクトは入力として渡すことができるます。
    public static void repeat(int times, Runnable fn) {
        for (int i = 0; i < times; i++) {
            fn.run();
        }
    }

    public static void main(String[] args) {
        Runnable callableFn = createPrintFn("Hello!");
        System.out.println(callableFn);
        callableFn.run();
        callableFn.run();
        callableFn.run();

        System.out.println("--------");
        repeat(3, callableFn);


        Function<String , Runnable> callableFnLambda = word -> () -> System.out.println(word);
        System.out.println(callableFnLambda.apply("hello world"));
        callableFnLambda.apply("Hello, Lambda!").run();


        // 関数型インターフェースで、呼び出し可能オブジェクトを入力に渡す例
        // Integer と Function を入力で受け取ります
        BiConsumer<Integer, Function<String, Runnable>> repeatLambda = (times, fn) -> {
            for(int i = 0; i < times; i++) {
                fn.apply("Hello, Lambda! Repeat").run();
            }
        };
        // Consumerはacceptメソッドで実行されます
        repeatLambda.accept(4, callableFnLambda);

        BiConsumer<String, Integer> printLength = (str, length) -> {
            System.out.println("文字列: " + str);
            System.out.println("長さ: " + length);
        };

        // BiConsumerの使用例
        printLength.accept("Hello", 5);
        printLength.accept("Java", 4);



        BiFunction<String, Supplier<String>, Supplier<String>> createHighOrderFn = (word, fn) -> () -> fn.get() + word;
        // 引数二つ（String, Supplier型）を受け取り、Supplier型を返すBiFunctionを定義します。
        // 入力に渡されるSupplier型の関数
        Supplier<String> step0Fn = () -> "step0: ";

        // 出力された関数を変数へ代入。続けて入力に渡すことができます
        Supplier<String> step1Fn = createHighOrderFn.apply("step1: ", step0Fn);
        Supplier<String> step2Fn = createHighOrderFn.apply("step2: ", step1Fn);

        System.out.println(step0Fn.get());
        System.out.println(step1Fn.get());
        System.out.println(step2Fn.get());
    }
}
