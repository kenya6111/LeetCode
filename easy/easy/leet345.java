package easy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Collections;

public class leet345 {
    public static String reverseVowels(String s) {
        if(s.length() ==0)return "";
        StringBuilder sb = new StringBuilder(s);
        Queue<Integer> queue = new ArrayDeque<>();
        List<Character> motherStrings=new ArrayList<>();


        for(int i=0;i<s.length();i++){
            if(s.charAt(i) =='a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u' || s.charAt(i) =='A' || s.charAt(i) =='E' || s.charAt(i) =='I' || s.charAt(i) =='O' || s.charAt(i) =='U'){
                queue.add(i);
                motherStrings.add(s.charAt(i));
            }
        }
        Collections.reverse(motherStrings);
        Queue<Character> queue2 = new ArrayDeque<>();
        for(int i=0;i<motherStrings.size();i++){
            queue2.add(motherStrings.get(i));

        }
        for(int i=0;i<s.length();i++ ){
             if(queue.isEmpty()){
                break;
            }
            int a= queue.peek();
            if(i == a){
                sb.replace(i,i+1,String.valueOf(queue2.poll()) );
                queue.poll();
            }
           

        }
        return sb.toString();
    }

public static void main(String[] args){
    
    System.out.println(reverseVowels(""));
    System.out.println("-----");
    System.out.println(reverseVowels("hello"));
    System.out.println(reverseVowels("leetcode"));
}
}
