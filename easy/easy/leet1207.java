package easy;
import java.util.HashMap;
import java.util.HashSet;

public class leet1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> occurrences = new HashSet<>();
        for (int count : map.values()) {
            if (!occurrences.add(count)) {
                // この出現回数は既にセットに存在する。
                // したがって、出現回数が重複しているため、falseを返す。
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums={1,2,2,1,1,3};

        //System.out.println(uniqueOccurrences(nums));

        HashSet<Integer> test = new HashSet<>();
        test.add(1);
        test.add(2);
        test.add(3);
        System.out.println(test);
        System.out.println(test.add(3));
    }
}
