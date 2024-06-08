package mondaikaiketuryoku;

public class pr3_4 {
    public static void main(String[] args){
        System.out.println("aaa");


        int min_val=Integer.MAX_VALUE;
        int[] test=new int[]{4,8,9};
        int[] test2=new int[]{10,22,1};
        int min_i=Integer.MAX_VALUE;
        int min_j=Integer.MAX_VALUE;
        for(int i=0;i<test.length;i++){
            for(int j=0;j<test2.length;j++){
                int currentSum = test[i] + test2[j];
                if(currentSum < min_val){
                    min_val= currentSum;
                    min_i=i;
                    min_j=j;
                }
            }
        }

        System.out.println("i = "+ min_i);
        System.out.println("j = "+ min_j);
        System.out.println("minsum = "+ min_val);
    }
}
