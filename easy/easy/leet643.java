package easy;
// 643. Maximum Average Subarray I

// You are given an integer array nums consisting of n elements, and an integer k.

// Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

 

// Example 1:

// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
// Example 2:

// Input: nums = [5], k = 1
// Output: 5.00000
 


public class leet643 {

    public static  double findMaxAverage(int[] nums, int k) {
        // double maxSum=nums[0];
        // if(nums.length==k){
        //     for(int i=1;i<k;i++){
        //         maxSum+=nums[i];
        //     }
        // }

        // for(int i=0;i<nums.length-k+1; i++){
        //     int windowSum=0;
        //     for(int j = i ; j<i+k ;j++){
        //         windowSum+=nums[j];
        //     }

        //     if(windowSum>maxSum){
        //         maxSum=windowSum;
        //     }
        // }
        

        // return maxSum/k;

        ////GPTの回答
        double maxSum = 0;

        // 最初のウィンドウの合計を計算
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double windowSum = maxSum;

        // スライディングウィンドウ
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum / k;
    }

    public static void main(String[] args){

        int[] nums={1,12,-5,-6,50,3};
        int k=4;

        int[] nums2 = {4,0,4,3,3};
        int k2=5;


        System.out.println(findMaxAverage(nums, k));
        System.out.println(findMaxAverage(nums2, k2));
   
    }
    
}
