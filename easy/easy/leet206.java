package easy;

public class leet206 {

    public static ListNode reverseList(ListNode head) {
        //1 2 3 4 5 6 
        ListNode prev = null; // 以前のノードを追跡
        ListNode current = head; // 現在のノード
        ListNode next = null; // 次のノード
        while (current != null) {
            next = current.next; // 次のノードを一時保存
            current.next = prev; // 現在のノードの次を以前のノードにリンク
            prev = current; // 以前のノードを更新
            current = next; // 現在のノードを次のノードに移動
        }
        head = prev; // ヘッドを逆転させたリストの新しいヘッドに更新
        return head;

    }

    public static void printList(ListNode head){
        while(head !=null){
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static void main(String[] args){
        System.out.println("aaa");
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        printList(reverseList(node));

    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
