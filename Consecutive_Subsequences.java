import java.util.Stack;

public class Consecutive_Subsequences {
    public static void subsequences(int[] arr) {
        Stack<Integer> rt = new Stack<>();
        int n = arr.length;
        rt.push(arr[0]);

        for (int i = 0; i < n; i++) {
            if (arr[i] == rt.peek()) {
                continue;
            } else {
                rt.push(arr[i]);
            }
        }
        System.out.println(rt);
    }

    public static void main(String[] args) {
        int[] arr = { 1,1, 2, 2, 3, 5, 5, 5, 8,8 };
        for(int  i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        subsequences(arr);
    }
}
