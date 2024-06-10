package mondaikaiketuryoku;

import java.util.Arrays;

public class ch3_5 {

    public static boolean checkAllEven (int[] arr){
        //全部偶数かどうか
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2!=0){
                return false;
            }
        }

        return true;
    }
    // public static int howManyDivide(int[] arr){

    //     Arrays.sort(arr);
    //     int count=0;
    //     int current=arr[0];
    //     while(current>0){
    //         current=current/2;
    //         count++;
    //     }
    //     return count;
    // }
    public static int howManyTimes(int N) {
        int exp = 0;
        while (N % 2 == 0) {
            N /= 2;
            ++exp;
        }
        return exp;
    }
    public static void main(String[] args){

        // 解１
        // int[] test=new int[]{200,300,400,500};

        // if(!checkAllEven(test)){
        //     System.out.println("全値が偶数ではありません。");
        // }

        // for(int i=0;i<100;i++){
        //     if(!checkAllEven(test)) break;
        //     for(int j=0;j<test.length;j++){
        //         test[j] =test[j]/2;
        //     }
        // }

        // System.out.println(test);

        // 解2
        int[] test2=new int[]{200,300,400,500};
        int result = Integer.MAX_VALUE;
        for (int a : test2) {
            result = Math.min(result, howManyTimes(a));
        }
        System.out.println(test2);






    }
}
