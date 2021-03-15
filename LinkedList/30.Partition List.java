//interviewbit
public class Solution {
    public ListNode partition(ListNode head, int x) {
         ListNode bef = new ListNode(0);
        ListNode b = bef;
        ListNode aft = new ListNode(0);
        ListNode a = aft;
        ListNode temp = head;
        while(temp!=null){
            if(temp.val < x){
                b.next = temp;
                b = b.next;
            }else{
                a.next = temp;
                a=a.next;
            }
            temp = temp.next;
        }
        a.next = null;
        b.next = aft.next;
        return bef.next;
        
    }
}
