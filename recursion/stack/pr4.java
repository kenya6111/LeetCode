package recursion.stack;
import java.util.ArrayList;
import java.util.Stack;
//配列の逆表示
public class pr4 {

    public static int[] reverse(int[] arr){
        // 関数を完成させてください
        Stack<Integer> st = new Stack();
        for(int n: arr ){
            st.push(n);
        }

        ArrayList<Integer> darr = new ArrayList<Integer>();
        while(!st.empty()){
            darr.add(st.pop());
        }

        int[] result = new int[darr.size()];
        for(int i =0;i<darr.size();i++){
            result[i] = darr.get(i);
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

        int[] aaa = reverse(new int[]{1,2,3,4});
        writeint(aaa);
     }
}
