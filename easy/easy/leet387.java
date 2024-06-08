package easy;

import java.util.HashMap;
import java.util.Map;

public class leet387 {

    public static int firstUniqChar(String s) {
        Map<Character , Integer> map = new HashMap();

        for(int i =0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i =0;i<s.length();i++){
            if(map.get(s.charAt(i)) ==1 ){
                return i;
            }

        }

        return -1;
    }
    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));


    }
}
