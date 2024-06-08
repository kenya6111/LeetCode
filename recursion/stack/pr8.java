package recursion.stack;

import java.util.Stack;
public class pr8 {

    public static int[] dailyStockPrice(int[] stocks){
        // 関数を完成させてください
        // Stack<Integer> stack = new Stack<>();

        // int[] res = new int[stocks.length];
        // // 配列の後ろから追跡します
        // for (int i = stocks.length - 1; i >= 0; i--) {
        //     // 積み上げたスタックの頂上と現在の要素を常に比較し、現在の要素が大きければ、その要素より小さくなるまでスタックの頂上をpopし続けます。
        //     while (stack.size() > 0 && stocks[stack.peek()] <= stocks[i]) stack.pop();
        //     // スタックの頂上と現在の要素の差をres[i]に記録します。
        //     if (stack.size() > 0) res[i] = stack.peek() - i;
        //     // 現在の要素のインデックスをスタックにpushします。
        //     stack.push(i);
        // }

        // return res;



            //stocksの数列に着目した観点でいうと、前の数より小さいときは、速攻でより高くなるまでの日にちは１となるし、
            // 前の数よりでかければ、前の数と比較さえすれば、「前の数より小さい前々の数たち」は現在の数と比較しなくていい。無視していい。




            Stack<Integer> st = new Stack();
            int[] res = new int[stocks.length];

            for(int i = stocks.length-1; i>=0;i--){

                while(!st.empty() && stocks[i] >= stocks[st.peek()]){
                    st.pop();
                }
                if(!st.empty()){
                    res[i] = st.peek() - i;
                }

                st.push(i);

            }
            return res;
    }

    public static void printArray(int[] intArr){
        System.out.print("[");
        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args){
        System.out.println("aaa");
        printArray(dailyStockPrice(new int[]{58,59,56,44,37,83}));

        


     }
}


// 株式予測
// medium
// Garrett は R 商事の株を売買する事で儲けようと考えています。R 商事の毎日の予想株価リスト stocks が与えられたとき、
//各日にちの株価がより高くなるまで何日待つかを示したリストを返す、dailyStockPrice という関数を作成してください。
//株価がより高くなる日がない場合は 0 を入力してください。

// 関数の入出力例
// 入力のデータ型： integer[] stocks
// 出力のデータ型： integer[]
// dailyStockPrice([58,59,71]) --> [1,1,0]
// dailyStockPrice([58,59,37,83]) --> [1,2,1,0]
// dailyStockPrice([63,63,64]) --> [2,1,0]
// dailyStockPrice([85,83,67,83,81,38,88,85]) --> [6,5,1,3,2,1,0,0]
// dailyStockPrice([38,37,38,35,34,37,39,40,33,33]) --> [6,1,4,2,1,1,1,0,0,0]