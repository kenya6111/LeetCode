package medium;

import java.util.HashMap;

public class leet1679 {
    public static int maxOperations(int[] nums, int k) {
    //解１
    //     int count = 0;
    //    for (int first = 0; first < nums.length; first++) {
    //        // check if element pointed by first is already taken up
    //        if (nums[first] == 0) continue;
    //        for (int second = first + 1; second < nums.length; second++) {
    //            // check if element pointed by second is already taken up
    //            if (nums[second] == 0) continue;
    //            if (nums[first] + nums[second] == k) {
    //                nums[first] = nums[second] = 0;
    //                count++;
    //                break;
    //            }
    //        }
    //    }
    //    return count;


    //解２
    HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        // build the hashmap with count of occurence of every element in array
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int complement = k - nums[i];
            if (map.getOrDefault(current, 0) > 0
                    && map.getOrDefault(complement, 0) > 0) {
                if ((current == complement) && map.get(current) < 2)
                    continue;
                map.put(current, map.get(current) - 1);
                map.put(complement, map.get(complement) - 1);
                count++;
            }
        }
        return count;
   }


    public static void main(String[] args){


        int[] nums = {1,2,3,4};
        int k = 5;
        
        System.out.println(maxOperations(nums, k));
        




        // HashMap<Integer,Integer> map = new HashMap<>();
        // int[] nums2 = {1,1,2,3,2,3,4,8,2,4};
        // for (int i = 0; i < nums2.length; i++) {
        //     System.out.println(nums2[i]);;
        //     map.put(nums2[i], map.getOrDefault(nums2[i], 0) + 1);
        //     System.out.println(map);
        // }
        // System.out.println(map);


    }
}
