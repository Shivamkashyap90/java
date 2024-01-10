public class Array_Sum {
    public static int arraySum(int [] arr,int idx){
        //base case 
        if (idx==arr.length) {
           return 0;
        }
         int smallAns = arraySum(arr, idx+1);
         int sum = arr[idx]+smallAns;
         return sum;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println("The sum of array is :"+arraySum(arr, 0));
    }
}
