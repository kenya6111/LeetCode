package mondaikaiketuryoku;

public class pr4_4 {
    public static int GCD(int m , int n){

        if(n==0)return m;

        return GCD(n,m%n);

    }
    public static void main(String[] args){
        System.out.println("aaa");
        System.out.println(GCD(51,15));;

     }
}
