package medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class leet3 {
        public static int lengthOfLongestSubstring(String s) {
        // 解１----------------------------------------------
        // int n = s.length();

        // int res = 0;
        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         if (checkRepetition(s, i, j)) {
        //             res = Math.max(res, j - i + 1);
        //         }
        //     }
        // }
        // return res;

        // 解２----------------------------------------------
        // Map<Character, Integer> chars = new HashMap();

        // int left = 0;
        // int right = 0;

        // int res = 0;
        // while (right < s.length()) {
        //     char r = s.charAt(right);
        //     chars.put(r, chars.getOrDefault(r,0) + 1);

        //     while (chars.get(r) > 1) {
        //         char l = s.charAt(left);
        //         chars.put(l, chars.get(l) - 1);
        //         left++;
        //     }

        //     res = Math.max(res, right - left + 1);

        //     right++;
        // }
        // return res;


        // 解3 ---------------------------------------------------
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;

    }

    //解１から呼ばれるメソッド----------------------------------------------
    private static boolean checkRepetition(String s, int start, int end) {
        Set<Character> chars = new HashSet<>();

        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if(chars.contains(c)){
                return false;
            }
            chars.add(c);
        }

        return true;
    }
    
    public static void main(String[] args){
        System.out.println("aaa");
        //System.out.println(lengthOfLongestSubstring("abcabc"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));


        Set<String> set = new HashSet<String>();
        System.out.println("isEmpty "+set.isEmpty());
        
        set.add("banana");
        set.add("orange");
        set.add("apple");
        
        //例外は発生しないが、すでに値が保存されているため追加で保存されない
        set.add("banana");
        set.add("banana");

        System.out.println("contains "+set.contains("banana"));
        for (String value : set) {
            System.out.print(value + " ");
        }
        System.out.println();


        set.forEach(value -> {
            System.out.print(value+" ");
        });
        System.out.println();

        
        System.out.println(set.isEmpty());
        set.remove("banana");
        
        System.out.println(Math.max(20, 12));  // 20
        System.out.println(Math.max(7.215, 5.08));  // 7.215




        

     }
}
