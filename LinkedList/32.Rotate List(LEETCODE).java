//Leetcode-61,IB
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
            return head;
        int len =1 ;
        ListNode temp = head;
        while(temp.next!=null){
            len++;
            temp=temp.next;
        }
        
        temp.next = head;//make it circular
        k=len-k%len;
        while(k--!=0){
            temp=temp.next;
        }
        head=temp.next;
        temp.next=null;
        
        return head;
        
    }
}
