//Copy contents of one stack to another in reverse order

import java.util.Stack;

public class CopyInReversOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(9);
        st.push(5);
        st.push(7);
        st.push(3);
        st.push(1);
        
        System.out.println(st);
        //for revers order create another stack
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            rt.push(st.pop());
        }
        System.out.println(rt);
    }
}
