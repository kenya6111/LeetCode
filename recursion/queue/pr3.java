package recursion.queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class pr3 {
    public static void main(String[] args){
        System.out.println("aaa");
//         Queue<Integer> que=new Queue();
        
// Javaにおいて Queue<Integer> que = new Queue(); が間違っている理由は、Queue がインターフェースであるため、直接インスタンス化することができないからです。
// Javaでは、インターフェースは直接インスタンス化することができません。代わりに、そのインターフェースを実装する具体的なクラスのインスタンスを作成する必要があります。
// Queue インターフェースの一般的な実装には、LinkedList、ArrayDeque などがあります。そのため、Queue を使用するには、例えば以下のように記述する必要があります：

// Queue<Integer> que = new LinkedList<>();
// Queue<Integer> que = new ArrayDeque<>();
// このようにして、具体的なクラスのインスタンスを作成し、Queue インターフェースの型の変数に割り当てることで、キューを使用する準備が整います。
    int [] arr=new int[]{3,2,1,5,6,4};
    ArrayDeque<Integer> que = new ArrayDeque<>();
    que.add(arr[0]);
    for(int i =1 ;i<arr.length;i++){
        if(que.getFirst()>=arr[i]){
            que.addLast(arr[i]);
        }else{
            que.addFirst(arr[i]);
        }
    }

    System.out.println(que.peekFirst());









     }
}
