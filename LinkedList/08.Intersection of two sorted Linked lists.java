//https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1#
class Sol
{
   public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node a = head1;
        Node b = head2;
        Node d = new Node(0);
        Node c = d;
        while(a!=null && b!=null){
            if(a.data == b.data){
                Node n = new Node(a.data);
                c.next = n;
                c = c.next;
                a = a.next;
                b = b.next;
            }else if(a.data<b.data){
                a = a.next;
            }else
            b =b.next;
        }
         return d.next;
    }
   
}
