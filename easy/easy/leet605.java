package easy;
// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

 

// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false
 

// Constraints:

// 1 <= flowerbed.length <= 2 * 104
// flowerbed[i] is 0 or 1.
// There are no two adjacent flowers in flowerbed.
// 0 <= n <= flowerbed.length


public class leet605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;

        // Check for special case when the flowerbed length is 1
        if (length == 1) {
            return (flowerbed[0] == 0 ? 1 : 0) >= n;
        }

        // Check the first plot
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            n--;
        }

        // Check the middle plots
        for (int i = 1; i < length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) {  // Early exit if no more flowers need to be planted
                    return true;
                }
            }
        }

        // Check the last plot
        if (flowerbed[length - 1] == 0 && flowerbed[length - 2] == 0) {
            n--;
        }

        return n <= 0;
    }
    public static void main(String[] args){
        int[] test1 = {1,0,0,0,1};
        int[] test2 = {1,0,0,0,1};
        int[] test3 = {1,0,0,0,1,0,1};
        int[] test4 = {1,0,1,0,1,0,1};
      //  System.out.println(canPlaceFlowers(test1,1));
        //System.out.println(canPlaceFlowers(test2,2));
       // System.out.println(canPlaceFlowers(test3,1));
        System.out.println(canPlaceFlowers(test4,1));
    
    }
}
