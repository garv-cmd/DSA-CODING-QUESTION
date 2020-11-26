//https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1
class Sol
{
    static int carry =1;
   static void add(Node head)
{
if(head==null)
return;
add(head.next);
head.data+=carry;
carry=head.data/10;
head.data%=10;
}
    public static Node addOne(Node head) 
    { 
        carry=1;
add(head);
if(carry==0)
return head;
Node temp=new Node(1);
temp.next=head;
return temp;
}
}
