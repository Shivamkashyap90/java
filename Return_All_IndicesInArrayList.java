import java.util.ArrayList;

public class Return_All_IndicesInArrayList {
   static ArrayList<Integer> allIndices(int[] arr ,int n, int target, int idx){
    ArrayList<Integer> ans = new ArrayList<>();
    //Base case 
    if (idx>=n) {
        return ans;
    }
    //self work
    if (arr[idx]==target) {
        ans.add(idx);
    }
    //Recursive work
    ArrayList<Integer> smallAns= allIndices(arr, n, target, idx+1);
    ans.addAll(smallAns);
    return ans;
   } 
   public static void main(String[] args) {
     int [] arr = {5,6,8,5,2,4,7,5,6,9,5};
     int target = 5;
     int n= arr.length;
    ArrayList<Integer> ans= allIndices(arr, n, target, 0);
      for (Integer i : ans) {
        System.out.print(i+" ");
      }
   }
}
