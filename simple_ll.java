public class simple_ll{
    // firstly we will create a node class 
    public static class Node {
            int data;
            Node next;
            //create constructor
            Node(int data)
            {
                this.data=data;
            }
         }
         public static class Linkedlist{
            Node head =null;
            Node tail = null;
            void insertAtEnd(int val)
            {
                Node temp = new Node(val);
                if(head==null)
                {
                    head=temp;
                }
                else{
                    tail.next=temp;
                }
                 tail=temp;
            }
            void display()
            {
                Node temp = head;
                while(temp!=null)
                {
                    System.out.print(temp.data +" ");
                    temp=temp.next;
                }
            }
            //for size
            int size(){
                Node temp = head;
                int count=0;
                while (temp!=null) {
                    count++;
                    temp=temp.next;
                }
                return count;
            }
            void insertAtBegining(int val)
            {
                Node temp = new Node(val);
                //for empty list
                if(head==null)
                {
                    head=temp;
                    tail=temp;
                }
                else
                {
                    temp.next=head;
                    head=temp;
                }
                 
            }
            void insertAtAnyindex(int idx, int val)
            {
                Node t =  new Node(val);
                Node temp = head;
                
                if(idx == size())
                { 
                    insertAtEnd(val);
                    return;
                }
                else if (idx == 0)
                {
                    insertAtBegining( val);
                    return;
                }
                for(int i=0;i<idx-1;i++)
                {
                    temp = temp.next;
                }
                t.next=temp.next;
                temp.next=t;

            }
            int getElement(int idx)
            {
                Node temp = head;
                for(int i=0;i<idx-1;i++)
                {
                    temp=temp.next;
                }
                return temp.next.data;
            }

            void deleteAt(int idx)
            {
                Node temp = head;
                if(idx==0)
                {
                    head=head.next;
                }
                for(int i=0;i<=idx-1;i++)
                {
                    temp=temp.next;
                }
                temp.next=temp.next.next;
                tail=temp;
            }

         }
         public static void main(String[] args) {
            Linkedlist ll = new Linkedlist();
            ll.insertAtEnd(4);
            ll.insertAtEnd(7);
            ll.insertAtEnd(9);
            ll.insertAtBegining(12);
            ll.insertAtBegining(45);
            ll. insertAtAnyindex(1,34);
            ll.display();
            System.out.println();
            System.out.println("size is "+ll.size());
            System.out.println();
             ll.deleteAt(1);
            ll.display();
            System.out.println();
            //System.out.println("The index data is : "+ll.getElement(3));
            System.out.println();
            System.out.println("Size is "+ ll.size());
         }
}