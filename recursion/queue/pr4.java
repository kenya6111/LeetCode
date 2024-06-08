package recursion.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class pr4 {
    public static ArrayList<Integer> slidingWindow(int[] arr, int k){
        ArrayList<Integer> darr = new ArrayList<>();
    
        ArrayDeque<Integer> que = new ArrayDeque<>();
        que.addLast(arr[0]);
        for(int i=1;i<k;i++){
            if(arr[i] > que.getFirst()){
                que.addFirst(arr[i]);
            }else{
                que.addLast(arr[i]);
            }
        }
        darr.add(que.getFirst());
        que.remove(arr[0]);

    for(int i=k;i<arr.length;i++){
        if(arr[i] > que.getFirst()){
            que.addFirst(arr[i]);
        }else{
            que.addLast(arr[i]);
        }
        darr.add(que.getFirst());
        que.remove(arr[i-k+1]);
    }
   



        return darr;

    }

    public static void printdarr(ArrayList<Integer> darr){
        for(int i=0;i<darr.size();i++){
            System.out.println(darr.get(i));
        }

    }
    public static void main(String[] args){
        System.out.println("aaa");

        printdarr(slidingWindow(new int[]{1,2,3,4,5,2,5,8,3,6}, 4));
     }
}
