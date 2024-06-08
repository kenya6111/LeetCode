package z_javademanabu.chapter1;

public class prac2 {
    public static int min4(int a,int b,int c,int d){
        int min=Integer.MAX_VALUE;
        if(a<min){
            min=a;
        }
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        if(d<min){
            min=d;
        }
            return min;
    }
    public static void main(String[] args){
        System.out.println("aaa");
        System.out.println(min4(1,2,3,4));
        System.out.println(min4(1,-22,443,42));
     }
}
