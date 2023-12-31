public class removenthNodeFromEnd {
    public static class Node {
        int data;
        Node next;
        Node(int data)
        {
           this.data=data;
        }   
   }
   public static void display(Node head)
   {
    Node temp = head;
    while (temp!=null) {
        System.out.println(temp.data +" ");
        temp=temp.next;
    }
   }
   public static Node nthNode(Node head,int n)
   {
      Node slow=head;
      Node fast=head;

      for(int i=1;i<=n;i++)
      {
       fast=fast.next;
      }
      while (fast!=null) {
       slow=slow.next;
       fast=fast.next;
      }
      slow.next=slow.next.next;
      return head;
   }
   public static void main(String[] args) {
       Node a = new Node(100);
       Node b = new Node(200);
       Node c = new Node(389);
       Node d = new Node(490);
       Node e = new Node(878);

       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=null;
       display(a);
       System.out.println();
        a = nthNode(a, 5);
        System.out.println();
       display(a);
   }
}
