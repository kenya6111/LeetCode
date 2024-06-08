package mondaikaiketuryoku;

import java.util.Scanner;

public class pr3_2 {
    public static void main(String[] args){
        System.out.println("aaa");

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner);
        int N = scanner.nextInt();
        int v = scanner.nextInt();
        //   System.out.println(N);
        //   System.out.println(v);

        int found_id=0;
        int[] test=new int[]{1,2,3,4,54,5,4,4,32,1};
        boolean exist=false;
        for(int i=0;i<test.length;i++){
            if(test[i] == 4){
                exist=true;
                found_id=i;
                break;
            }
        }
        if (exist) {
            System.out.println("Yes");
            System.out.println("foundID is "+found_id);
        } else {
            System.out.println("No");
        }
     }
}
