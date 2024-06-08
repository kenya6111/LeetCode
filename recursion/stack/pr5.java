package recursion.stack;

import java.util.Stack;
import java.util.ArrayList;

//単調減少している最後の部分配列を取り出す問題
public class pr5 {
     public static int[] consecutiveWalk(int[] arr){
        Stack<Integer> stack = new Stack();
        stack.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            // スタックの上にある要素より、arr[i]が大きい場合、スタックをリセットします。
            if(stack.peek() <= arr[i]){
                // スタックがnullになるまで繰り返されます。
                while(!stack.empty()){
                    stack.pop();
                };
            }
            // スタックにプッシュします。スタックは常に単調減少になっています。
            stack.push(arr[i]);
        }
        

        ArrayList<Integer> resultDynamic = new ArrayList<>();
        // resultsは逆向きになっています。
        // add(0, num)は、配列の先頭にnumを追加します。
        while(!stack.empty()) resultDynamic.add(0,stack.pop());
        // 固定配列に入れ替えます。
        int[] results = new int[resultDynamic.size()];
        for (int i = 0; i < resultDynamic.size(); i++) results[i] = resultDynamic.get(i);
        return results;
    }
    public static void writeint(int[] nums){
        for(int n: nums){
            System.out.println(n);

        }

    }
    public static void main(String[] args){
        System.out.println("aaa");
        writeint(consecutiveWalk(new int[]{1,2,74,32,4,6,5}));
     }
    
}
