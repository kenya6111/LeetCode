package medium;

import java.util.HashSet;
import java.util.Set;

public class leet1456 {

    public static int maxVowels(String s, int k) {
        //自分の解法
        // int maxVowelNUmber=0;
        // int count=0;
        // for(int i=0;i<s.length()-k+1;i++){
        //     for(int j=i;j<i+k;j++){
        //         if(s.charAt(j) =='a' || s.charAt(j) =='e' || s.charAt(j) =='i' || s.charAt(j) =='o' || s.charAt(j) =='u' ){
        //             count++;
        //         }

        //     }
        //     if(count > maxVowelNUmber){
        //         maxVowelNUmber=count;
        //     }

        //     count=0;
        // }

        // return maxVowelNUmber;



        //お手本
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        
        // Build the window of size k, count the number of vowels it contains.
        int count = 0;
        for (int i = 0; i < k; i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
        }
        int answer = count;
        
        // Slide the window to the right, focus on the added character and the
        // removed character and update "count". Record the largest "count".
        for (int i = k; i < s.length(); i++) {
            count += vowels.contains(s.charAt(i)) ? 1 : 0;
            count -= vowels.contains(s.charAt(i - k)) ? 1 : 0;
            answer = Math.max(answer, count);
        }
        
        return answer;
        
    }
    
public static void main(String[] args){
    String s = "abciiidef";
    int k = 3;
    System.out.println(maxVowels(s, k));

    // Set<Integer> hs = new HashSet<Integer>();
    //     //値を追加
    //     hs.add(6);
    //     hs.add(11);
    //     hs.add(3);
    //     hs.add(3);
    //     hs.add(null);
    //     hs.add(4);
    //     hs.add(10);

    //     System.out.println(hs);

   
}
}
