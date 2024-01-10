public class Max_Value_Of_Array_usignRecursio {
    static int  maxInArray(int[] arr,int idx){
        //base case 
        if (idx==arr.length-1) {
            return arr[idx];
        }
        int smallAns = maxInArray(arr, idx+1);

        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int arr[] ={5,6,9,4};
         System.out.println("Max number is : "+maxInArray(arr, 0));
    }
}
