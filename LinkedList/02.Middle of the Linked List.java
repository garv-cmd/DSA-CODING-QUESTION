//leetcode - 876
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 //tortoise method
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        // ListNode temp = head;
        // int i=0;
        // while(temp!=null){
        //     i++;
        //     temp = temp.next;
        // }
        // int mid = i/2;
        // while(mid-- !=0){
        //     head = head.next;
        // }
        // return head;
    }
}
