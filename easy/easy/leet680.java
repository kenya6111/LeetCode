package easy;
public class leet680 {

    public static boolean checkPalindrome(String s, int i,int j){
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int start =0;
        int end= s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return checkPalindrome(s, start+1, end) || checkPalindrome(s, start, end-1);
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("aaa");
        String s="abcdedcba";
        String s2="aebcbe";

        //System.out.println(checkPalindrome(s,0,s.length()-1));
        System.out.println(validPalindrome(s2));



     }
}
