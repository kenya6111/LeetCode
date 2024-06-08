package mondaikaiketuryoku;

import java.util.Scanner;
import java.util.Arrays;


public class ch3_4 {

public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; ++i) {
        a[i] = scanner.nextInt();
    }

    //昇順にソートして最初と最後の要素の差を出力する
    // Arrays.sort(a);
    // System.out.println(a[a.length-1]-a[0]);

    //線形探索
    int maxValue=Integer.MIN_VALUE;
    int minValue=Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++){
        if(a[i]>maxValue) maxValue=a[i];
        if(a[i]<minValue)minValue=a[i];
    }
    System.out.println(maxValue-minValue);





}
}
