package medium;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class leet2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {//9,9,9,9,9,9,9と9,9,9,9を足したとき、最後の最後で9+0+1で繰り上がりの１を処理するための部分。
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
    public static void main(String[] args){
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);
    
            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);

            System.out.println(l1.val);
            System.out.println(l1.next.val);
            System.out.println(l1.next.next.val);

           // ListNode result = addTwoNumbers(l1, l2);


            ListNode l3 = new ListNode(9);
            l3.next = new ListNode(9);
            l3.next.next = new ListNode(9);
            l3.next.next.next = new ListNode(9);
            l3.next.next.next.next = new ListNode(9);
            l3.next.next.next.next.next = new ListNode(9);
            l3.next.next.next.next.next.next = new ListNode(9);

            ListNode l4 = new ListNode(9);
            l4.next = new ListNode(9);
            l4.next.next = new ListNode(9);
            l4.next.next.next = new ListNode(9);

            ListNode result2 = addTwoNumbers(l3, l4);


    }
}
