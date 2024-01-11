import java.util.Scanner;

public class K_Multiple_Of_Num_usingRecursion {
    
    //create a method
    public static void KMultipleOfNum(int n ,int k){
        //base case 
        if (k==1) {
            System.out.print(n+" ");
            return;
        }

        //recursive work
        KMultipleOfNum(n,k-1);
        //self work
        System.out.print(n*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        System.out.print("Enter k multiplis of number : ");
        int k =sc.nextInt();
         System.out.println("The k multiplis of nums are : ");
        KMultipleOfNum(n,k);
    }
}
