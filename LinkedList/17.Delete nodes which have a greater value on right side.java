//https://practice.geeksforgeeks.org/problems/delete-nodes-having-greater-value-on-right/1#
class GfG
{
    Node compute(Node head)
    {
        // your code here
        if(head.next == null)
        return head;
        
       Node temp = compute(head.next);
       if(temp.data > head.data){
           return temp;
       }else{
           head.next = temp;
       }
       return head;
    }
}
