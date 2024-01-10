public class Min_value_OfArrayUsingRecursion {
    public static int minValue(int [] arr,int idx){
        //base case 
        if (idx==arr.length-1) {
            return arr[idx];
        }
        int smallAns = minValue(arr, idx+1);

        return Math.min(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int [] arr = {5,8,9,2,1,-1,6,5,1};
        System.out.println("The min value is "+minValue(arr, 0));
    }
}
