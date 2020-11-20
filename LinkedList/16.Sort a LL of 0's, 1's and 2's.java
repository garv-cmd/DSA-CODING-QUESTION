//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
class LinkedList
{
    static Node segregate(Node head)
    {
        Node temp = head;
        int a=0,b=0,c=0;
        while(temp!=null){
            if(temp.data == 0)
            a++;
            else if(temp.data==1)
            b++;
            else
            c++;
            temp = temp.next;
        }
        Node temp1 = head;
        Node one = new Node(1);
         Node two = new Node(2);
          Node zero = new Node(0);
        while(a-- !=0){
            temp1.data = zero.data;
            temp1 = temp1.next;
        }
        
        while(b-- !=0){
            temp1.data = one.data;
            temp1 = temp1.next;
        }
        
        while(c-- !=0){
            temp1.data = two.data;
            temp1 = temp1.next;
        }
        // add your code here
        return head;
    }
}

