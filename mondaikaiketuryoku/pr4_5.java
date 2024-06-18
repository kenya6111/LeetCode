package mondaikaiketuryoku;

public class pr4_5 {
    public static int fibo(int n){
    System.out.println("項数が"+n+"の呼び出し");
        if(n==0)return 0;
        if(n==1) return 1;
        
        System.out.println("-------------");
        return fibo(n-1)+fibo(n-2);

    }
    public static void main(String[] args){
        // System.out.println(fibo(4));
        System.out.println(fibo(5));

    }
}
