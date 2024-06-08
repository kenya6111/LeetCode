package easy;
import java.util.HashSet;
import java.util.Set;

public class leet202 {

  static boolean isHappy(int n){
    Set<Integer> seen = new HashSet<>();
    while(n != 1){
      if(seen.contains(n)){
        return false;
      }

      seen.add(n);
      n = toNextNum(n);
    }
    return true;
  }

  static int toNextNum(int n){
    int result =0;

    while(n>0){
      int itinokurai = n%10;
      int nijyou =itinokurai*itinokurai;
      result +=nijyou;

      n/=10;
    }
    return result;
  }




  public static void main(String[] args){
    // Set<Integer> seen = new HashSet<>();
    // seen.add(1);
    // seen.add(2);
    // seen.add(3);
    // System.out.println(seen);
    // System.out.println(seen.contains(1));
    // seen.add(3);
    // System.out.println(seen);

    System.out.println(isHappy(19));

  }

}
