public class FindAll_Indices_UsingRecursion {
    static void findAllIndices(int [] arr,int n,int target,int idx){
        //Base case 
        if (idx>=n) {
            return;
        }
        //Self work 
        if (arr[idx]==target) {
            System.out.print(+idx+",");
        }
        //Recursive work
         findAllIndices(arr, n, target, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {2,5,8,2,4,2,6,9};
        int target= 2;
        int n= arr.length;
        System.out.print("The all posible indices are : ");
        findAllIndices(arr, n, target, 0);
    }
}
