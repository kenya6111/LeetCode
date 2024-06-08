package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class leet5 {

    // 解1
    public static String longestPalindrome(String s) {
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (check(start, start + length, s)) {
                    return s.substring(start, start + length);
                }
            }
        }
        return "";
    }

    private static boolean check(int i, int j, String s) {
        int left = i;
        int right = j - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // 解2
    public static String longestPalindrome2(String s){
        int n= s.length();
        boolean[][] dp = new boolean[n][n];
        int[] res = new int[]{0,0};

        for(int i=0; i<n ;i++){
            dp[i][i] = true;
        }

        for(int i=0; i<n-1;i++){
            if(s.charAt(i) == s.charAt(i + 1)){
                dp[i][i + 1] = true;
                res[0] =i;
                res[1]=i+1;
            }
        }

        for(int diff = 2; diff<n; diff++){
            for(int i=0 ;i<n-diff;i++){
                int j = i+ diff;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    res[0]=i;
                    res[1]=j;
                }
            }
        }

        int i = res[0];
        int j = res[1];
        return s.substring(i, j + 1);
    }

public static void main(String[] args){
    // System.out.println(longestPalindrome("babab"));
    // System.out.println(longestPalindrome("cbbd"));
    System.out.println(longestPalindrome("cabababa"));

}
}
