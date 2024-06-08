package easy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class leet2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        // HashMap<Integer,Integer> map1= new HashMap<>();
        // HashMap<Integer,Integer> map2= new HashMap<>();
        // List<List<Integer>> result = new ArrayList<>();
        // List<Integer> darr1 = new ArrayList<>();
        // List<Integer> darr2 = new ArrayList<>();

        // for(int i=0;i<nums1.length;i++){
        //     map1.put(nums1[i],nums1[i]);
        // }

        // for(int i=0;i<nums2.length;i++){
        //     map2.put(nums2[i], nums2[i]);
        // }

        // for(int i =0;i<nums1.length;i++){
        //     if(!map2.containsKey(nums1[i])){
        //         darr1.add(nums1[i]);
        //     }
        // }
        // for(int i =0;i<nums2.length;i++){
        //     if(!map1.containsKey(nums2[i])){
        //         darr2.add(nums2[i]);
        //     }
        // }

        // result.add(darr1);
        // result.add(darr2);

        // return result;

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> darr1 = new ArrayList<>();
        List<Integer> darr2 = new ArrayList<>();

        // nums1 の要素を set1 に追加
        for(int num : nums1){
            set1.add(num);
        }

        // nums2 の要素を set2 に追加
        for(int num : nums2){
            set2.add(num);
        }
        
        // set1 に存在し、set2 に存在しない要素を darr1 に追加
        for(int num : set1){
            if(!set2.contains(num)){
                darr1.add(num);
            }
        }
        
        // set2 に存在し、set1 に存在しない要素を darr2 に追加
        for(int num : set2){
            if(!set1.contains(num)){
                darr2.add(num);
            }
        }
        
        result.add(darr1);
        result.add(darr2);
        
        return result;

    }

    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};


        int[] nums3 = {1,2,3,3};
        int[] nums4 = {1,1,2,2};

        //System.out.println(findDifference(nums1,nums2));
        System.out.println(findDifference(nums3,nums4));

    }

}
