// Leetcode - 160

public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        if(head1==null || head2==null)
            return null;
        
        ListNode a = head1;
        ListNode b = head2;
        
        while(a!=b){
            a = a==null?head2:a.next;
            b = b==null?head1:b.next;
        }
        return a;
        
        /*
        ListNode t1 = head1;
        ListNode t2 = head2;
        int l1 = 0;
        int l2=0;
        while(t1!=null){
            t1 = t1.next;
            l1++;
        }
        
        while(t2!=null){
            t2 = t2.next;
            l2++;
        }
        ListNode p1 = head1;
        ListNode p2 = head2;
        if(l1 > l2){
            for(int i=0;i<l1-l2;i++)
                p1 = p1.next;
        }
        else{
            for(int i=0;i<l2-l1;i++)
                p2 = p2.next;
        }
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1; */
        
    }
}
