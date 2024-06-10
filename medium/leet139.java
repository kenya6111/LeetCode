
package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leet139 {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict); // wordDict を Set に変換
System.out.println(wordSet);
        boolean[] dp = new boolean[s.length() + 1];
        System.out.println(s.length());
        dp[0] = true; // 初期条件：空文字列は常に分割可能

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }

    public static void main(String[] args){
        System.out.println("aaa");
        String s1 = "leetcode";
        List<String> wordDict1 = Arrays.asList("leet", "code");
        System.out.println(wordBreak(s1, wordDict1)); // true
        Set<String> wordSet = new HashSet<>(wordDict1);
        System.out.println(wordSet);
        System.out.println(wordSet.contains("let"));
    }
}