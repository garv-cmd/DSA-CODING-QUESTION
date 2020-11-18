/** leetcode - 19
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        ListNode start = new ListNode();
        start.next = head;
        ListNode slow = start;
        ListNode fast = start;
        for(int i=0;i<n;i++)
        {
            fast = fast.next;
        }
        while(fast.next!=null){
            fast = fast.next;
            slow= slow.next;
            
        }
        slow.next = slow.next.next;
        return start.next;
        
//         if(head==null)
//             return head;
//         if(head.next==null && n==1){
//             head = null;
//             return head;
//         }
//         ListNode temp = head;
//         int len=1;
//         while(temp!=null){
//             len++;
//             temp = temp.next;
//         }
//         int front = len-n-1;
//         int k=1;
//         if(front==0)
//         {
//             head = head.next;
//             return head;
//         }
//         ListNode res = head;
//         while(k++!=front){
            
//             head = head.next;
//         }
//         head.next = head.next.next;
//         return res;
    }
}
