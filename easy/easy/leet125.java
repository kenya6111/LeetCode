package easy;

public class leet125 {
  public static  boolean isPalindrome(String s) {
    String str= s.replace(",","").replace(" ","").replace(":","").toLowerCase();
    System.out.println(str);

    int start = 0;
    for (int i=str.length()-1; i>=0; i--) {
      
      if(i  < str.length()/2){
        break;
      }
      if (str.charAt(start) != str.charAt(i)) {
        return false;
      }

      start++;

    }
    return true;


  }

public static void main(String[] args){


  String s = "A man, a plan, a canal: Panama";

	System.out.println(isPalindrome(s));


}

}
