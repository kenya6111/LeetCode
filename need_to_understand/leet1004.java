package need_to_understand;

// 1004. Max Consecutive Ones III
// Medium
// 8K
// 105
// company
// Facebook
// company
// Amazon
// company
// Google
// Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

// Example 1:

// Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
// Output: 6
// Explanation: [1,1,1,0,0,1,1,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
// Example 2:

// Input: nums = [0,0,1,1\,0,0,1,1,1,0,1,1,0,0,0\,1,1,1,1], k = 3
// Output: 10
// Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
// Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

public class leet1004 {
    public static int longestOnes(int[] nums, int k) {
//0,1,1,1,0,1,0,1
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            // If we included a zero in the window we reduce the value of k.
            // Since k is the maximum zeros allowed in a window.
            if (nums[right] == 0) {
                k--;
            }
            // A negative k denotes we have consumed all allowed flips and window has
            // more than allowed zeros, thus increment left pointer by 1 to keep the window size same.
            if (k < 0) {
                // If the left element to be thrown out is zero we increase k.
                k += 1 - nums[left];
                left++;
            }
        }
        return right - left;
    }

    public static void main(String[] args){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
//                           \         \         \
        int[] nums2={0,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k2 = 3;

        int[] nums3 ={1,1,1,1,0,0,0,1,1,0,0,0,1,1};
        int k3 = 2;

        int[] num4 ={0,1,1,1,0,1,0,1};
        int k4=1;
        //System.out.println(longestOnes(nums,k));
        System.out.println(longestOnes(num4,k4));
    }
}
