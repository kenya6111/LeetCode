package recursion.queue;

import java.util.HashMap;
import java.util.Stack;

public class pr6 {
    public static boolean isParenthesesValid(String parentheses){
        // 関数を完成させてください
        Stack<Character> charStack = new Stack<Character>();
        // key => serched char
        // value => pair
        HashMap<Character, Character> pairs = new HashMap<Character, Character>();

        pairs.put('}','{');
        pairs.put(')','(');
        pairs.put(']','[');

        for(int i = 0; i < parentheses.length(); i++) {
            Character currChar = parentheses.charAt(i);

            if (charStack.empty() || charStack.peek() != pairs.get(currChar)) charStack.push(currChar); 
            else charStack.pop();
        }

        return charStack.empty();
    }

    public static void main(String[] args){
        System.out.println(isParenthesesValid("((()(())))"));
     }
}
// Walker は出版社で文章チェックの仕事をしています。() や {}、[] で括られている文章をチェックしているのですが、正しく使われているか見なければいけません。文字列 parentheses が与えられるので、それが有効かどうか判定する、isParenthesesValid という関数を定義してください。与えられる文字列が有効の条件は以下の通りです。

// 左カッコが同じ種類の右カッコで閉じられてる
// 左カッコが右カッコによって正しい順で閉じられている
// 関数の入出力例

// 入力のデータ型： string parentheses

// 出力のデータ型： bool

// isParenthesesValid("{}") --> true

// isParenthesesValid("[{}]") --> true

// isParenthesesValid("[{(]") --> false

// isParenthesesValid("(){}[]") --> true

// isParenthesesValid("((()(())))") --> true

// isParenthesesValid("[{(}])") --> false

// isParenthesesValid("]][}{({()){}(") --> false

// isParenthesesValid("{(([])[])[]}[]") --> true

// isParenthesesValid("{(([])[])[]]}") --> false

// isParenthesesValid("{{[[(())]]}}") --> true