package recursion.stack;

import java.util.Stack;
import java.util.ArrayList;
public class pr6 {
    public static int[] consecutiveWalk(int[] arr){
        
        // if(arr.length==0)return new int[]{};
        // Stack<Integer> st = new Stack();
        // st.push(arr[0]);
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i] <= st.peek()){
        //         while(!st.empty()){
        //             st.pop();
        //         }
        //     }
        //     st.push(arr[i]);
        // }
        // ArrayList<Integer> darr = new ArrayList<>();
        // while(!st.empty()){
        //     darr.add(st.pop());
        // }
        // int[] result = new int[darr.size()];
        // for(int i=0;i<darr.size();i++){
        //     result[i] = darr.get(i);
        // }
        // return result;

        if (arr.length == 0) return new int[]{};

        Stack<Integer> stack = new Stack<>();
        for (int num : arr) {
            if (!stack.isEmpty() && num <= stack.peek()) {
                stack.clear();
            }
            stack.push(num);
        }

        int[] result = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pop();
        }

        return result;
    }
    public static void writeint(int[] nums){
        for(int n: nums){
            System.out.println(n);

        }

    }
    public static void main(String[] args){
        System.out.println("aaa");
        // ArrayList<Integer> darr = new ArrayList<>();
        // darr.add(1);
        // darr.add(44);
        // darr.add(5);
        // System.out.println(darr.get(0));
        // System.out.println(darr.get(1));
        // System.out.println(darr.get(2));
        writeint(consecutiveWalk(new int[]{1,2,74,32,4,6,5}));
     }
    
}
