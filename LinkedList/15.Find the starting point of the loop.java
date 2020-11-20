//leetcode - 142
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null)
            return null;
        ListNode temp = head;
        ListNode slow = head;
        ListNode fast = head;
       boolean check  = false;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                check = true;
                break;
            }
        }
        if(check == false){
            return null;
        }
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
        
    }
}
