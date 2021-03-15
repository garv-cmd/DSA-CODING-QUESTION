public class Solution {
    public ListNode merge(ListNode a,ListNode b){
        if(a==null)
        return b;
        if(b==null)
        return a;
        
        if(a.val<b.val){
            a.next = merge(a.next,b);
            return a;
        }else{
             b.next = merge(a,b.next);
            return b;
        }
    }
    public ListNode sortList(ListNode A) {
        if(A==null || A.next==null)
        return A;
        
        ListNode slow = A;
        ListNode fast = A;
        
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        } // 4 5 3
        fast = slow.next;//
        slow.next = null;// 
        
        return merge(sortList(A),sortList(fast));
    }
}
