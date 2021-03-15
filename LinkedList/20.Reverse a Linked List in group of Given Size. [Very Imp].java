//leetcode - 25

 ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        int count=0;
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        if(len>=k){
        while(curr!=null && count<k){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            
            count++;
        }
        }
        else{
            return head;
        }
        if(curr!=null){
            head.next = reverseKGroup(fwd,k);
        }
        return prev;


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr= dummy,nex=dummy,pre=dummy;
        int count=0;
        while(curr.next!=null)
        {
            curr=curr.next;
            count++;
        }
        while(count>=k){
            curr = pre.next;
            nex = curr.next;
            for(int i=1;i<k;i++){
                curr.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = curr.next;
            }
            pre=curr;
            count-=k;
        }
        return dummy.next;
        
        
        
    }
}



//GFG - https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1#
 public static Node reverse(Node head, int k)
    {
        //Your code here
        Node curr=head;
Node next=null;
Node prev=null;
int count=0;
while(curr!=null && count<k){ 
    next=curr.next;
curr.next=prev;
prev=curr;
curr=next;
count++;
}
if(next!=null)
head.next=reverse(next,k);

return prev;
    }
