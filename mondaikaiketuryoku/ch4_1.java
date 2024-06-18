package mondaikaiketuryoku;

public class ch4_1 {

    public static int toribo(int n){

        if(n==0)return 0;
        if(n==1)return 0;
        if(n==2)return 1;

        return toribo(n-1)+toribo(n-2)+toribo(n-3);
    }


    public static void main(String[] args){
        System.out.println("aaa");
        System.out.println(toribo(7));
    }
}
