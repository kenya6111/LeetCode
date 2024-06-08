package easy;
// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false
 

// Constraints:

// 0 <= s.length <= 100
// 0 <= t.length <= 104
// s and t consist only of lowercase English letters.


public class leet392 {
    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0; // sのインデックス

        // tの各文字に対して繰り返し
        for (int tIndex = 0; tIndex < t.length(); tIndex++) {
            if (sIndex < s.length() && s.charAt(sIndex) == t.charAt(tIndex)) {
                // sの現在の文字がtの文字と一致した場合、sのインデックスを進める
                sIndex++;
            }
        }

        // sの全ての文字がtの中に順番に見つかったかどうかを返す
        return sIndex == s.length();
    }
    public static void main(String[] args){
       

        System.out.println(isSubsequence("abc","ahgfbc"));
   
    }
}
