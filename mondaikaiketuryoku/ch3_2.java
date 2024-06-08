package mondaikaiketuryoku;

import java.util.Scanner;

public class ch3_2 {
    
public static void main(String[] args){
    System.out.println("aaa");


    Scanner scanner = new Scanner(System.in);

        // 入力受け取り
        int N = scanner.nextInt();
        int V = scanner.nextInt();
        int targetCount =0;



        int[] a = new int[N];
        for (int i = 0; i < N; ++i) {
            a[i] = scanner.nextInt();
        }


        for(int i=0;i<a.length;i++){
            if(a[i] == V){
                targetCount++;
            }
        }

        System.out.println(targetCount);




}
}
