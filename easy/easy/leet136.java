package easy;
import java.util.Arrays;
public class leet136{

	public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length ==1){
            return nums[0];
        }

        for(int i=0;i<nums.length -1 ;i+=2){
            if(nums[i] != nums[i+1]){
                return nums[i];

            }

        }
        return nums[nums.length-1];
    }
public static void main(String[] args){
    System.out.println(211);

		int[] numbers = new int[]{4,1,2,1,2};
		int[] numbers2 = new int[]{4,1,2,1,2,3,3};


		System.out.println(singleNumber(numbers2));


}

}