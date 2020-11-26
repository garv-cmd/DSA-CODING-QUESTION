//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1#
class Solution{
    static Node revList(Node head)
{
Node curr = head;
Node prev = null;
Node next = null;
while(curr != null)
{
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}
return prev;
}
    static Node addLists(Node l1, Node l2){
        // code here
        // return head of sum list
        l1 = revList(l1);
l2 = revList(l2);
         int sum =0;
        Node temp = new Node(0);
        Node res = temp;
        while(sum!=0 || l1!=null || l2!=null){
            if(l1!=null){
                sum+=l1.data;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.data;
                l2 = l2.next;
            }
            res.next = new Node(sum%10);
            sum /=10;
            res = res.next;
        }
        return revList(temp.next);
        
    }
}
