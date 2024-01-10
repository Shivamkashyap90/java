import java.util.Scanner;

public class Sum_Of_Digit_UsingRecursion {
    public static int Sod(int n)
    {
        //base case 
        if (n>=0 && n<=9) {
            return n;
        }
        //recursive work 
        int smallwork = Sod(n/10);
        //self work 
        return smallwork+n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.println("Sum of digit is : "+Sod(n));
    }
}
