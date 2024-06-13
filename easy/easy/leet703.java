package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class leet703 {
    public ArrayList<Integer> nums = new ArrayList<>();

    public int k;
    public leet703 (int k, int[] nums){
        this.k = k;
        for(int num : nums){
            this.nums.add(num);
        }
    }

    public int add(int val) {
        this.nums.add(val);
        Collections.sort(nums);

        return this.nums.get(this.nums.size() -this.k);
    }
public static void main(String[] args){
    leet703 kthLargest = new leet703(3, new int[]{4, 5, 8, 2});
    System.out.println(kthLargest.add(3));   // 4
    System.out.println(kthLargest.add(5));   // 5
    System.out.println(kthLargest.add(10));  // 5
    System.out.println(kthLargest.add(9));   // 8
    System.out.println(kthLargest.add(4));   // 8
}
}
