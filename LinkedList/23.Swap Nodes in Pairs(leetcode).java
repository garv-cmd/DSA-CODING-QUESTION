leetcode - 24
  class Solution {
    public ListNode swapPairs(ListNode head) {
        solve(head);
        return head;
            
    }
    
    public void solve(ListNode head){
        if(head==null || head.next==null){
            return;
        }
        int n = head.val;
        head.val = head.next.val;
        head.next.val = n;
        solve(head.next.next);
    }
}
