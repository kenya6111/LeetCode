package recursion.stack;
import java.util.Stack;
public class pr10 {

    public static String getNumber(String code){
        // 関数を完成させてください
         // コードの長さが8を超える場合、0を返す
         if (code.length() > 8) {
            return "0";
        }
        
        // 数字を保持するためのスタック
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        // 最初の数字をスタックにプッシュ
        stack.push(1);

        // 次の数字（この場合は、スタックに積むためのインデックスとして2から開始）
        int nextNum = 2;

        // コードを解析する
        for (char ch : code.toCharArray()) {
            if (ch == 'I') {
                // 'I'の場合、スタックに積まれた数字をポップして結果に追加
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                stack.push(nextNum); // 次の数字をプッシュ
            } else if (ch == 'D') {
                // 'D'の場合、減少シーケンスなので、数字をスタックに積む
                stack.push(nextNum);
            }
            nextNum++; // 次の数字に更新
        }

        // 残った数字をすべてポップして結果に追加
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();

    }
    public static void main(String[] args){
        System.out.println("aaa");
        System.out.println(getNumber("IIDDD"));
     }
}


//IncreaseとDecrease
// medium
// ゲームクリエイターの Levy は、ゲーム内で暗号を解かなければ開かない扉を設置しました。
//その暗号は、アルファベットの I と D のみで構成されています。I は増加（increasing）、D は減少（decreasing）を意味しており、
//表示された文字列によって答えの数値が変わります。I と D で構成された文字列 code が与えられるので、答えとなる数値を返す getNumber という関数を
//作成してください。ただし、1 から 9 までの数字のみ使用可能とし、各値は 1 回しか使えないものとします。
//もし文字数が 8 を超えたら 0 を返してください。

// 例えば、D の場合、1 回分減少しなければいけません。このような条件を満たす数値のうち最小の値は 21 になります。IIDDD の場合、各値は 1 回のみしか使えないので、増加、減少を考慮すると、最小の値は 126543 になります。
// 関数の入出力例
// 入力のデータ型： string code
// 出力のデータ型： string
// getNumber("D") --> 21
// getNumber("I") --> 12
// getNumber("DD") --> 321
// getNumber("IIDDD") --> 126543
// getNumber("DDIDDIID") --> 321654798
// getNumber("DIIDIDDD") --> 213549876
// getNumber("IIIDIDDD") --> 123549876
// getNumber("DIIDIDDDIID") --> 0