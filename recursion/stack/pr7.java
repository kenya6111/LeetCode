package recursion.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class pr7 {
    public static void main(String[] args){
        System.out.println("aaa");

        // HashSetクラスの特徴
        //1. 重複した値を格納しようとすると、エラーは発生しないが格納されない
        //2. 値の順序が保証されていない
        Set<String> hashset =new HashSet<>();
        hashset.add("チンパンジー");
        hashset.add("ゴリラ");
        hashset.add("キリン");
        hashset.add("キリン");
        hashset.add("aa");


        // キュー構造
        Deque<String> q = new ArrayDeque<String>();
        q.addLast("AAAAA");
        q.addLast("BBBBB");
        q.addLast("CCCCC");
        System.out.println(q);  // 結果：[AAAAA, BBBBB, CCCCC]
        System.out.println(q.removeFirst());    // 結果：AAAAA
        System.out.println(q);

        // スタック構造
        Deque<String> s = new ArrayDeque<String>();
        s.addLast("AAAAA");
        s.addLast("BBBBB");
        s.addLast("CCCCC");
        System.out.println(s);  // 結果：[AAAAA, BBBBB, CCCCC]
        System.out.println(s.removeLast()); // 結果：CCCCC
        System.out.println(s);  // 結果：[AAAAA, BBBBB]
    }
}
