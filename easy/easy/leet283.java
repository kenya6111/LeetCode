package easy;
import java.util.ArrayList;
import java.util.List;

public class leet283 {

    public static void moveZeroes(int[] nums) {
        //回答１
        // int insertPos = 0;
        // for (int num : nums) {
        //     if (num != 0) {
        //         nums[insertPos++] = num;
        //     }
        // }

        // while (insertPos < nums.length) {
        //     nums[insertPos++] = 0;
        // }
        //--------------------------------------------------------------------------------------------------------------
        //回答２
        int n = nums.length;

        // Count the zeroes
        int numZeroes = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                numZeroes++;
            }
        }

        // Make all the non-zero elements retain their original order.
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                ans.add(nums[i]);
            }
        }

        // Move all zeroes to the end
        while (numZeroes-- > 0) {
            ans.add(0);
        }

        // Combine the result
        for (int i = 0; i < n; i++) {
            nums[i] = ans.get(i);
        }
    }

    public static void main(String[] args){
        int[] nums={1,2,3,0,4,0,5};
        moveZeroes(nums);
        System.out.println(nums);

    }
    
}
