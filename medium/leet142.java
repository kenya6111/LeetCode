package medium;

public class leet142 {
    public static  ListNode detectCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null || fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow== fast){
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // サイクルの開始ノード
            }
        }

        return null;
    }
    public static void main(String[] args){

    

        System.out.println("aaa");
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next; // ノードindex 1でサイクルを作成

        ListNode cycleNode1 = detectCycle(head1);
        System.out.println(cycleNode1 != null ? "Tail connects to node index " + cycleNode1.val : "No cycle");


    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}