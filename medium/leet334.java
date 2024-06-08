package medium;
// 334. Increasing Triplet Subsequence
// Medium
// 7.6K
// 414
// company
// TikTok
// company
// Google
// company
// Facebook
// Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

 

// Example 1:

// Input: nums = [1,2,3,4,5]
// Output: true
// Explanation: Any triplet where i < j < k is valid.
// Example 2:

// Input: nums = [5,4,3,2,1]
// Output: false
// Explanation: No triplet exists.
// Example 3:

// Input: nums = [2,1,5,0,4,6]
// Output: true
// Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 

// Constraints:

// 1 <= nums.length <= 5 * 105
// -231 <= nums[i] <= 231 - 1
public class leet334 {
    public static boolean increasingTriplet(int[] nums) {
        // int counter =0;
        // int before=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] >before){
        //         counter++;
        //     }else{
        //         counter=0;
        //     }
        //     before = nums[i];

        //     if(counter ==2 ){
        //         return true;
        //     }

        // }

        // return false;

        int first_num = Integer.MAX_VALUE;
        int second_num = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n <= first_num) {
                first_num = n;
            } else if (n <= second_num) {
                second_num = n;
            } else {
                return true;
            }
        }
        return false;
    }


public static void main(String[] args){
    int[] nums ={2,1,5,0,4,6};
    int[] nums2 = {20,100,10,12,5,13};
    int[] test={1,2,3,4,5};
    int[] test2 ={5,4,3,2,1};
    int[] test3 ={5,4,3,2,1,2,3,4,5};

    //System.out.println(increasingTriplet(nums));
    //System.out.println(increasingTriplet(nums2));
    //System.out.println(increasingTriplet(nums2));
    System.out.println(increasingTriplet(test2));
}
}