package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class leet349 {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> map =new HashSet<>();
        ArrayList<Integer> darr = new ArrayList<>();
        for(int num: nums1){
            map.add(num);
        }

        for(int num : nums2){
            if(map.contains(num)){
                if(!darr.contains(num)){
                    darr.add(num);
                }
            }

        }
        int[] result = new int[darr.size()];

        for(int i=0;i<darr.size();i++){
            result[i] = darr.get(i);
        }



        return result;
    }
    public static void printarr(int[] arr){
        for(int n:arr){
            System.out.print(n+",");
        }
        System.out.println();
    }

    public static void main(String[] args){
        System.out.println("aaa");
        int[] num1 = new int[]{4,9,5};
        int[] num2 = new int[]{9,4,9,8,4};
        printarr(intersection(num1, num2));
        
        
        int[] num3 = new int[]{1,2,3};
        int[] num4 = new int[]{9,4,9,8,4};
        printarr(intersection(num3, num4));
        
        
        int[] num5 = new int[]{1,3};
        int[] num6 = new int[]{9,1,3,8,4};
        printarr(intersection(num5, num6));
     }
    
}
