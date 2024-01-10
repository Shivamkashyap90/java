import java.util.Scanner;

public class Sum_With_AlternativeSigns_UsingRecursion {
    //create a method 
    public static int SumWithAlternativeSigns(int n){
        //base case 
        if (n==0) {
            return n;
        }

        if (n%2==0) {
            return SumWithAlternativeSigns(n-1)-n;
        }else{
            return SumWithAlternativeSigns(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n= sc.nextInt();
        System.out.println("The sum of alternative signs is : "+SumWithAlternativeSigns(n));
    }
}
