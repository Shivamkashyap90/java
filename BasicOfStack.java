import java.util.Stack;
public class BasicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.size());
        st.push(78);
        st.push(54);
        st.push(14);
        st.push(20);
        st.push(74);
        st.push(26);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st);
        while (st.size()>2) {
            st.pop();
        }
        System.out.println(st);
        System.out.println(st.size());
    }
}
