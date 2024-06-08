package mondaikaiketuryoku;

import java.util.Scanner;

public class pr3_1 {

    public static void main(String[] args){
        System.out.println("aaa");
          Scanner scanner = new Scanner(System.in);
          System.out.println(scanner);
          int N = scanner.nextInt();
          int v = scanner.nextInt();
        //   System.out.println(N);
        //   System.out.println(v);
        int[] test=new int[]{1,2,3,4,54,5,4,4,32,1};
        boolean exist=false;
        for(int i=0;i<test.length;i++){
            if(test[i] == 1){
                exist=true;
                break;
            }
        }
        if (exist) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
}
}
