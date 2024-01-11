public class Search_ForTagetUsingRecursion {
    static boolean search(int [] arr,int n,int target,int idx){
        //base case 
        if (idx>=n) {
            return false;
        }
        //self work
        if (arr[idx]==target) {
            return true;
        }
      //recursive work
      return search(arr, n, target, idx+1);  
    }
    public static void main(String[] args) {
        int arr[]={5,6,9,4,7,3,1};
        int target=8;
        if (search(arr, arr.length, target, 0)) {
            System.out.println("yes, target exist");
        }
        else{
            System.out.println("no,target is not exist in this array");
        }
    }
}
