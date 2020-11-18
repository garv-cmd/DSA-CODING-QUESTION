/** leetcode - 2
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       int sum =0;
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        while(sum!=0 || l1!=null || l2!=null){
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            res.next = new ListNode(sum%10);
            sum /=10;
            res = res.next;
        }
        return temp.next;
    }
}
