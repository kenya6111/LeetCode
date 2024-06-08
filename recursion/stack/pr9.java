package recursion.stack;

import java.util.Stack;

class SinglyLinkedListNode<E>{
    public Integer data;
    public SinglyLinkedListNode<E> next;

    public SinglyLinkedListNode(Integer data){
        this.data = data;
        this.next = null;
    }
}
public class pr9 {
    public static boolean palindromeLinkedList(SinglyLinkedListNode<Integer> head){
    // 関数を完成させてください
        int count =0;
        Stack<Integer> st= new Stack<>();
        SinglyLinkedListNode node = head;
        while(node!=null){
            count++;
            node=node.next;
        }
        node=head;
        double half=count/2;
        for(int i=0;i<half;i++){
            st.push(node.data);
            node=node.next;
        }

        if(count%2 !=0)node=node.next;

        while(node!=null){
            if(node.data!=st.pop())return false;
            node=node.next;

        }

        return true;

    }

    public static void main(String[] args){
        SinglyLinkedListNode<Integer> node1 = new SinglyLinkedListNode(2);
        SinglyLinkedListNode<Integer> node2 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode<Integer> node3 = new SinglyLinkedListNode(5);
        SinglyLinkedListNode<Integer> node4 = new SinglyLinkedListNode(3);
        SinglyLinkedListNode<Integer> node5 = new SinglyLinkedListNode(2);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        System.out.println(palindromeLinkedList(node1));
     }




}


//回文連結リスト
// medium
// 連結リストの先頭 head が与えられるので、それが回文になっているか判定する、palindromeLinkedList という関数を作成してください。
// 関数の入出力例
// 入力のデータ型： SinglyLinkedListNode<integer> head
// 出力のデータ型： bool
// palindromeLinkedList(singlyLinkedList([1,2,3])) --> false
// palindromeLinkedList(singlyLinkedList([1,2])) --> false
// palindromeLinkedList(singlyLinkedList([1,0,1])) --> true
// palindromeLinkedList(singlyLinkedList([3,4,4,3,6])) --> false
// palindromeLinkedList(singlyLinkedList([3,6,4,4,3,6])) --> false
// palindromeLinkedList(singlyLinkedList([3,6,4,4,6,3])) --> true
// palindromeLinkedList(singlyLinkedList([1,2,3,2,1])) --> true