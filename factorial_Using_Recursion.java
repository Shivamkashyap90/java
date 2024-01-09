import java.util.Scanner;

public class factorial_Using_Recursion {
    public static int factorial(int n){
        //Base case
        if (n==0) {
            return 1;
        }
         //self work recursive work
         return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number that would you like in calculate factorial");
        int n = sc.nextInt();
        System.out.println("The factorial is :"+factorial(n));
    }
}
