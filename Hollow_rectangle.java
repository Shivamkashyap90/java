import java.util.Scanner;
public class Hollow_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values");
        int row = sc.nextInt();
        System.out.println("Enter column values");
        int col =sc.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1||j==1||row==1||col==1||row==i||col==j)
                {
                    System.out.print("*");
                }
                else{

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
