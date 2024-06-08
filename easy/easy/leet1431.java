package easy;
// キャンディーを持った子供たちがいますn。あなたには、子供が持っているキャンディーの数を表す整数配列candiesと、あなたが持っている余分なキャンディーの数を表す整数が与えられます。candies[i]ithextraCandies

// 長さ のブール配列を返します。ここで、 は、子供にすべてを与えた後、子供全員の中で最も多くのキャンディーを持っている場合、またはそうでない場合です。resultnresult[i]trueithextraCandiesfalse

// 複数の子供が最大数のキャンディーを手に入れることができることに注意してください。

 

// 例 1:

// 入力: candies = [2,3,5,1,3]、extraCandies = 3
// 出力: [true,true,true,false,true] 
// 説明:すべての extraCandies を次のように与えるとします。
// - 子供 1 は、2 + 3 = 5 個のキャンディーを持っています。これは子供たちの中で最大です。
// - 子ども 2 は、3 + 3 = 6 個のキャンディーを持ちます。これは、子どもたちの中で最大です。
// - 子供 3 は、子供たちの中で最大の 5 + 3 = 8 個のキャンディーを持っています。
// - 子供 4 は、1 + 3 = 4 個のキャンディーを持っていますが、これは子供の中では最大ではありません。
// - 子供 5 は、3 + 3 = 6 個のキャンディーを持っています。これは子供たちの中で最大です。
// 例 2:

// 入力: candies = [4,2,1,1,2]、extraCandies = 1
// 出力: [true,false,false,false,false] 
// 説明:追加のキャンディーは 1 つだけです。
// たとえ別の子供に余分なキャンディーが与えられたとしても、子供 1 は常に最大数のキャンディーを持っています。
// 例 3:

// 入力: candies = [12,1,12]、extraCandies = 10
// 出力: [true,false,true]
 

// 制約:

import java.util.ArrayList;
import java.util.List;

public class leet1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int max=0;
        for(int candy: candies){
            if(max < candy){
                max=candy;
            }
        }


        for(int candy : candies){
            if(candy + extraCandies >= max){
                result.add(true);

            }else{
                result.add(false);

            }

        }
        return result;
        
        
    }
    public static void main(String[] args){
        int[] test1={2,3,5,1,3};
        int[] test2={4,2,1,1,2};
        int[] test3={12,1,2};

        System.out.println(kidsWithCandies(test1, 3)); // "ABC"
        System.out.println(kidsWithCandies(test2, 1)); // "AB"
        System.out.println(kidsWithCandies(test3, 10));   // ""
    
    }


    
}
