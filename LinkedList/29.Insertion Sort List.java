public class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode start = new ListNode(-1);
        start.next = head;
        ListNode curr = head;
        ListNode prev = start;
        
        while(curr!=null){
            if(curr.next!=null && curr.next.val < curr.val){
                while(prev.next != null && (prev.next.val < curr.next.val))
                    prev = prev.next;
                ListNode temp = prev.next;
                prev.next = curr.next;
                curr.next = curr.next.next;
                prev.next.next = temp;
                prev = start;
            }else{
                curr = curr.next;
            }
        }
        return start.next;
    }
}
