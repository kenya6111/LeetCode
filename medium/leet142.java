package medium;

public class leet142 {
    public static  ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // サイクルの検出
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // スローとファストが一致した場合、サイクルが存在する
                break;
            }
        }

        // サイクルが存在しない場合
        if (fast == null || fast.next == null) {
            return null;
        }

        // サイクルの開始地点を見つける
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // サイクルの開始ノード
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