package uzomuzo;
import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class pr_streamapi {
    public static void main(String[] args){

        int sum=IntStream.of(1,2,3,4,5).sum();

        System.out.println(sum);

        List<String> list=Arrays.asList("A","B","C");
        List<String> lowerCaseList = list.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(lowerCaseList);

        List<String> list2 = Arrays.asList("A", "B", "C");
        // コレクションListからStreamの生成
        Stream<String> stream = list2.stream();
        // Streamの要素を出力する
        stream.forEach(System.out::print);  
        System.out.println();
        
        
        int[] array = {1,2,3,4,5};
        
        // 配列からIntStreamを生成する
        IntStream stream2 = Arrays.stream(array);
        
        // Streamの要素を出力する
        stream2.forEach(System.out::print);
        
        System.out.println();
        
        String str = "Java Stream Sample";
        
        // 文字列列からIntStreamを生成する
        IntStream stream3 = str.chars();
        
        // Streamの要素を出力する
        stream3.forEach(System.out::print);
        
        
        
        System.out.println();

        List<String> list4 = Arrays.asList("apple", "banana", "cherry", "avocado");
        Stream<String> stream4 = list4.stream()
            .filter(s -> s.startsWith("a")) // 中間操作filter
            .map(s -> s.toUpperCase()); // 中間操作map

        // Streamの要素を出力する
        stream4.forEach(System.out::println);


    }
}
