package recursion.rambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class rambda5 {
    public static void main(String[] args) {
         //ArrayListのインスタンスを生成して参照を戻すラムダ式を代入する
         Supplier<List<String>> supplier = ()->new ArrayList();
         //Suplierインターフェイスのgetメソッドを使うとArrayListを生成できる
         List<String> list =supplier.get();
            list.add("最後まで拝読頂き");
            list.add("ありがとうございます");
            System.out.println(list);


            ArrayList<Integer> darr = new ArrayList<>();
            darr.add(1);
            darr.add(2);
            darr.add(3);
            darr.add(4);
            System.out.println(darr);

            Supplier<Supplier<String>> testSupplyFn = ()-> () -> {return "おつかれ！";};
            System.out.println(testSupplyFn.get());
            System.out.println(testSupplyFn.get().get());

            
      Supplier<String> outputF = testSupplyFn.get();

      System.out.println("Running a function that was generated...." + outputF.get());

       // 数値xを取り込み、その後xと入力を乗算する関数を返します。
       Function<Integer, Function<Integer, Integer>> constantMultiplication = x -> y -> {return y*x;};

       System.out.println(constantMultiplication.apply(4).apply(3));

    }
}
