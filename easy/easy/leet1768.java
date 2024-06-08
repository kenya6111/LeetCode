package easy;
// 1768. Merge Strings Alternately
// Easy
// 3.2K
// 62
// Companies
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

 

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s
// Example 3:

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d
 


public class leet1768 {
    public static String mergeAlternately(String word1, String word2) {
    //回答１（自分）
        // String result="";
        // boolean flg = false;

        // while(word1.length() != 0 || word2.length()!= 0){
        //     if(flg==false){
        //         if(word1.length()==0)continue;
        //         result+=word1.charAt(0);
        //         word1=word1.substring(1);
        //         flg=true;
        //         continue;
        //     }else{
        //         if(word2.length()==0)continue;
        //         result += word2.charAt(0);
        //         word2 = word2.substring(1);
        //         flg=false;
        //         continue;
        //     }
        // }
        // return result;
    
    //回答2(chatGPT)
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        boolean flag = true;

        while (i < word1.length() || j < word2.length()) {
            if (flag && i < word1.length()) {
                result.append(word1.charAt(i++));
            } else if (!flag && j < word2.length()) {
                result.append(word2.charAt(j++));
            }
            flag = !flag; // 交互にフラグを切り替える
        }
        return result.toString();
    }

public static void main(String[] args){
    System.out.println(mergeAlternately("abc","pqr"));
}
}
