package easy;
// Given an array of integers nums, calculate the pivot index of this array.

// The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

// If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

// Return the leftmost pivot index. If no such index exists, return -1.

 

// Example 1:

// Input: nums = [1,7,3,6,5,6]
// Output: 3
// Explanation:
// The pivot index is 3.
// Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
// Right sum = nums[4] + nums[5] = 5 + 6 = 11
// Example 2:

// Input: nums = [1,2,3]
// Output: -1
// Explanation:
// There is no index that satisfies the conditions in the problem statement.
// Example 3:

// Input: nums = [2,1,-1]
// Output: 0
// Explanation:
// The pivot index is 0.
// Left sum = 0 (no elements to the left of index 0)
// Right sum = nums[1] + nums[2] = 1 + -1 = 0




public class leet724 {
    public static int pivotIndex(int[] nums) {
        // int leftSum=0;
        // int rightSum=0;
        // int pivotIndex=0;

        // for(int i=0;i<nums.length;i++){
        //     if(i == 0 || i==nums.length-1){
        //         if(i==0){
        //             leftSum=0;
        //         }
        //         if(i==nums.length-1){
        //             rightSum=0;
        //     }
        // }else{
        //     leftSum = currculateLeftSum(i,nums);
        //     rightSum = currculateRightSum(i,nums);
        //     if(leftSum==rightSum)return pivotIndex=i;

        // }
        // }
        // return pivotIndex;

        //お手本
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) {
                return i;
            }

            leftsum += nums[i];
        }
        return -1;



    }

    // public static int currculateLeftSum(int index, int[] nums){
    //     int sum=0;
    //     for(int i =0; i<index; i++){
    //         sum+=nums[i];
    //     }

    //     return sum;

    // }

    // public static int currculateRightSum(int index, int[] nums){
    //     int sum=0;
    //     for(int i =index+1; i<nums.length; i++){
    //         sum+=nums[i];
    //     }

    //     return sum;

    // }

public static void main(String[] args){
    int[] num={1,7,3,6,5,6};
    System.out.println(pivotIndex(num));


}
}


//