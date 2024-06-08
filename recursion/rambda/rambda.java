package recursion.rambda;
import java.util.function.*;

public class rambda {

    // 通常の関数
    public static int asc(int x){
        return x + 1;
    }

    // 自作インターフェースの定義 アノテーションを付けて関数型インターフェースであることを宣言します。
    @FunctionalInterface
    interface AscLambda{
         // メソッドを1つだけ持ちます。インターフェースなので実装はありません。
        Integer add1(Integer x );
    }
    public static void main(String[] args) {

        System.out.println(asc(1));

        AscLambda asclambda1 = new AscLambda(){
            @Override
            public Integer add1(Integer x){
                return x+1;
            }
        };
        System.out.println(asclambda1.add1(3));

        // ラムダ式
        // 匿名クラスの実装を簡潔に記述できます。
        AscLambda aALambda2= x -> x+100;
        System.out.println(aALambda2.add1(5));

        // 関数型インターフェース
        // 関数型インターフェースである「引数（Integer）を一つ受け取り、戻り値（Integer）を返す Function 型」を使用します。
        Function<Integer, Integer> ascLambda3 = x -> x + 1;
        // Functionインターフェースは apply メソッドを持っています。
        System.out.println(ascLambda3.apply(1));


        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

        // BiFunctionの使用例
        int result = sum.apply(5, 3);
        System.out.println(result);  // 8


        
        // 引数が1つしかない
        Function<String, String> func1 = (str1) -> str1+"!";
        System.out.println(func1.apply("Aha")); //Aha!
        
        Function<String ,String> funcStr= (str) -> str + "test!!!";
        System.out.println(funcStr.apply("yeah!"));
        
        BiFunction<String, String, String> combineStrings = (str1, str2) -> str1+str2;
        System.out.println(combineStrings.apply("Hello ", "World")); //Hello World
        
        
        // Integer型の値を２つ受け取り、Integer型の値（合計）を返却する関数
        BiFunction<Integer, Integer, Integer> func0 = (arg0, arg1) -> arg0 + arg1;
        System.out.println(func0.apply(1, 3)); // 4
        
        // Integer型の値を１つ受け取り、「Integer型の値を１つ受け取りInteger型の値を返却する関数」を返却する関数（func0のカリー化）
        Function<Integer, Function<Integer, Integer>> func11 = arg0 -> arg1 -> func0.apply(arg0, arg1);
        // 部分適用する
        Function<Integer, Integer> func2 = func11.apply(3);
        System.out.println(func2.apply(4)); // 7
        System.out.println(func2.apply(6)); // 9
        
        
        //カリー化とは
        Function<Integer , Function<Integer, Integer>> currying = x -> y -> x + y;
        System.out.println(currying.apply(11).apply(11));
        
        var partialApply = currying.apply(1);//Java 10 から var を使用することで変数の宣言時にデータ型の記述を省略することができます。
        System.out.println(partialApply.apply(2)); // 3
        System.out.println(partialApply.apply(3)); // 4
        System.out.println(partialApply.apply(4)); // 5
        
        
        
        // BiFunctionインターフェースを使用します。引数を2つ持つことができ、戻り値があります。
        // apply()で引数を渡すことができます。
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<>(){
            public Integer apply(Integer x, Integer y){
                return x + y;
            }
        };
        System.out.println(biFunction.apply(3, 5));// 8

         // この関数は、どこにも保存されておらず、渡されてもいないので、ガベージコレクタによって後に消去されます。メモリは命令を格納するために作成され、その後解放されます。
      System.out.println(callIntBiFunc((x, y) -> x + y, 3,5));
      // 変数に格納して呼び出してみましょう。呼び出し可能オブジェクトはオブジェクトなのですから。
      BiFunction<Integer, Integer, Integer> myCallable = (x, y) -> x + y;

      System.out.println(myCallable.apply(3, 5));//8
      System.out.println(myCallable.apply(10,10)); //20
      System.out.println(myCallable.apply(150,5)); //155
      System.out.println(myCallable);
    }

    public static Integer callIntBiFunc(BiFunction<Integer, Integer, Integer> f, Integer x, Integer y){
        return f.apply(x,y);
     }
}
