package easy;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
      val = x;
      next = null;
    }
}


public class leet160 {
    public static void main(String[] args){
     // System.out.println(45);

      
      ListNode headInterSection = new ListNode(8);
      headInterSection.next = new ListNode(4);
      headInterSection.next.next = new ListNode(5);

      ListNode headA = new ListNode(4);
      headA.next = new ListNode(1);
      headA.next.next = headInterSection;
      // リストB: 5 -> 6 -> 1 -> 8 -> 4 -> 5
      ListNode headB = new ListNode(5);
      headB.next = new ListNode(6);
      headB.next.next = new ListNode(1);
      headB.next.next.next = headInterSection;
      // headB.next.next.next.next = new ListNode(4);
      // headB.next.next.next.next.next = new ListNode(5);



      System.out.println(headA);
      System.out.println(headA.next);
      System.out.println(headA.next.next);
      System.out.println(headA.next.next.next);
      System.out.println(headA.next.next.next.next);
      System.out.println("--------------------------");
      System.out.println(headB);
      System.out.println(headB.next);
      System.out.println(headB.next.next);
      System.out.println(headB.next.next.next);
      System.out.println(headB.next.next.next.next);
      System.out.println(headB.next.next.next.next.next);
      System.out.println(headB.next.next.next.next.next.next);

      System.out.println(getIntersectionNode(headA , headB).val);
    }

   static  ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      if(headA == null || headB == null)return null;

      ListNode a = headA;
      ListNode b = headB;

      while( a != b){
          a = a==null?headB : a.next;
          b = b==null?headA : b.next;

      }
      return a;
  }
    }