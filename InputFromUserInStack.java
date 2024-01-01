import java.util.Scanner;
import java.util.Stack;

public class InputFromUserInStack {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.println("Enter the number of element ");
        int n = Sc.nextInt();
        System.out.println("Enter the elements");
        for(int i=1;i<=n;i++)
        {
            int x =Sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}
