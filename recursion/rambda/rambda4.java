package recursion.rambda;
import java.util.function.*;


public class rambda4 {
    public static int summation(Function<Integer,Integer> g, int a, int b){
        if(b < a) return 0;
        return g.apply(b) + summation(g, a, b-1);
    }
    
    //オーバーロード
    public static int summation(Supplier<Integer> g, int a, int b){
        if(b < a) return 0;
        return g.get() + summation(g, a, b-1);
    }

    public static int pPi(Function<Integer, Integer> g, int a, int b){
        if(b < a) return 1;
        return g.apply(b) * pPi(g, a, b-1);
    }

    //オーバーロード
    public static int pPi(Supplier<Integer> g, int a, int b){
        if(b < a) return 1;
        return g.get() * pPi(g, a, b-1);
    }
    public static void main(String[] args) {
        
        // 10までの総和
        // 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
        Function<Integer, Integer> identity = i -> i;
        System.out.println(summation(identity, 1, 10));
        System.out.println(summation(identity, 1, 5));

        // 10 * 100 の計算
        Supplier<Integer> function = () -> 10;
        System.out.println(summation(function, 1, 100));
        System.out.println(summation(function, 1, 1000));

        // 10の階乗(10!)
        System.out.println(pPi(identity, 1, 10));//3,628,800
        
        // 5^10 の計算
        Supplier<Integer> function5 = () -> 5;
        System.out.println(pPi(function5, 1, 10));// 9765625
        System.out.println(pPi(function5, 1, 2));// 9765625
        System.out.println(pPi(function5, 1, 3));// 9765625
        System.out.println(pPi(function5, 1, 4));// 9765625


        
    }
    
}
