package z_javademanabu.chapter1;

import java.util.Scanner;

public class prac1 {
    public static int max4(int a,int b,int c,int d){
        int max=Integer.MIN_VALUE;
        if(a>max){
            max=a;
        }
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(d>max){
            max=d;
        }
            return max;
    }
    public static void main(String[] args){
        System.out.println("aaa");
        System.out.println(max4(1,2,3,4));
        System.out.println(max4(-11,222,-100,2222));
    }
}
