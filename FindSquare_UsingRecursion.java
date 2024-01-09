import java.util.Scanner;

public class FindSquare_UsingRecursion {
    public static int pow(int p, int q)
    {
          //base case 
          if (q==0) {
            return 1;
          
          }
        
          int smallans= pow(p,q/2);
         if (q%2==0) {
            return smallans*smallans;
         }
         else{
            return p*smallans*smallans;
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number for calculate power: ");
        int p= sc.nextInt();
        int q = sc.nextInt();
        System.out.println("The power p^q is : "+pow(p,q));
    }
}
