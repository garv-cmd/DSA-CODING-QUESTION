//leetcode - 141
// gfg - https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
class Solution {
    public static boolean detectLoop(Node head){
        // Add code here
        if(head==null)
        return true;
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
