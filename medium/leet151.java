package medium;

import java.util.ArrayDeque;
import java.util.Deque;

public class leet151 {
    //  public static String reverseWords(String s) {
    //     int len = s.length();
    //     StringBuilder sb = new StringBuilder();
    //     Deque<String>  strArr =new ArrayDeque();
    //     // 先頭と末尾の空白を削除
    //     s = s.trim();//trimメソッド便利すぎワロタ。

    //     int a=0;
    //     for(int i=0;i<len; i++){
    //         if(s.charAt(i) == ' ' || i==len-1){
    //             if(i == len-1){
    //                 strArr.addLast(s.substring(a,i+1));
    //                 break;
    //             }
    //             strArr.addLast(s.substring(a,i));
    //             a=i+1;
    //         }
    //     }
    //     while(!strArr.isEmpty()){
    //         sb.append(strArr.removeLast());
    //         if(!strArr.isEmpty()){
    //             sb.append(" ");
    //         }
    //     }
    //     return sb.toString();
    // }

     public static String reverseWords(String s) {
         // 先頭と末尾の空白を削除
        s=s.trim();
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        Deque<String>  strArr =new ArrayDeque();

        int a=0;
        boolean inWord =false;
        for(int i=0;i<len; i++){
            if(s.charAt(i) != ' ' && !inWord){
                inWord = true;
                a = i;
            }
            if(inWord && (s.charAt(i) == ' ' || i==len-1)){
                if(i==len-1){
                    strArr.addLast(s.substring(a, i+1));
                    break;
                }
                inWord = false;
                strArr.addLast(s.substring(a, i));
            }
        }
        while(!strArr.isEmpty()){
            sb.append(strArr.removeLast());
            if(!strArr.isEmpty()){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s = "the sky is blue";
        System.out.println(reverseWords(s));

   
    }
}
