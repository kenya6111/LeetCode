package recursion.stack;

import java.util.Stack;

public class pr2 {
    public static void main(String[] args){
        System.out.println("aaa");
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        while(!st.empty()){
            System.out.println(st.pop());
        }
        //System.out.println(st.pop());//java.util.EmptyStackException
        
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(11);
        System.out.println(st.peek());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
     }
}
