package rasen;

class Node{
    int val;
    
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}

public class pr8_2 {
    public static void main(String[] args){
        System.out.println(1);
        Node test=new Node(1);
        Node test2=new Node(2);
        Node test3=new Node(3);
        Node test4=new Node(4);
        Node test5=new Node(5);
        Node test6=new Node(6);
        Node test7=new Node(7);
        Node test8=new Node(8);
        System.out.println(test.val);
        test.left=test2;
        test.right=test3;
        test2.left=test4;
        test2.right=test5;

        System.out.println(test.left.val);
        System.out.println(test.right.val);
        
        System.out.println(test2.left.val);
        System.out.println(test2.right.val);

    }
}
