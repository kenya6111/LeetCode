package medium;

import java.util.HashMap;

public class leet276 {
    private static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    public static int totalWays(int i , int  k){
        if(i == 1)return k;
        if(i==2)return k * k;
          // Check if we have already calculated totalWays(i)
        if (memo.containsKey(i)) {
            return memo.get(i);
        }
        memo.put(i, (k-1)*(totalWays(i-1,k) + totalWays(i-2, k)));
        return memo.get(i);
    }
    public static int numWays(int n, int k) {
        return totalWays(n,k);
    }


    public static void main(String[] args){
        System.out.println(numWays(3,2));
    }
}
