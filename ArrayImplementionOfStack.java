public class ArrayImplementionOfStack {
    public static class Stack {
          private int[] arr = new  int[5];
          int idx=0;
          
          //create push method
          void push(int x){
            if (isfull()) {
                System.out.println("Stack is full!");
            }
            arr[idx]=x;
            idx++;
          }
         //Now we will create peek method
         int peek(){
            if (idx==0) {
                System.out.println("Stack is empty");
            }
            return arr[idx-1];
         } 

         //Now we will create pop method
         int pop(){
            if (idx==0) {
                System.out.println("Stack is empty !");
                return -1;
            }
            int top = arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
         }
         //now, we will create a display method
         void display(){
            for(int i=0;i<=idx-1;i++)
            {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
         }

         // create isEmpty method
         boolean isEmpty(){
            if (idx==0) {
                return true;
            }
            else return false;
         }

         //create isfull method
         boolean isfull(){
            if (idx==arr.length) {
                return true;
            }
            else return false;
         }
         //create size method
         int size(){
            return idx;
         }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.display();//1 
        st.push(2);
        st.display();//1 2
        st.push(3);
        st.display();//1 2 3
        st.push(4);
        st.display();//1 2 3 4 
        System.out.println("The size of this stack is : "+ st.size());//4
        st.pop();//4
        st.display();//1 2 3
        System.out.println("The size of this stack is : "+ st.size());//3
        st.push(5);
        st.push(6);
        st.display();//1 2 3 5 6
        System.out.println("The size of this stack is : "+ st.size());//5
        System.out.println(st.isfull());//true
        System.out.println(st.isEmpty());//false
        st.push(9);//Stack is full!
    }
}
