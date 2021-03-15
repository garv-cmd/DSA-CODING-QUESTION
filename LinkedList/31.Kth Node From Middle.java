//IB
public class Solution {
    public int solve(ListNode A, int B) {
        // If there are no nodes then return -1;
        if (A == null) return -1;
      
        // Keep 2 pointers, fast and slow.
        ListNode current = A;
        ListNode fast = A;
        
        // count the number of elements between start and mid.
        int count = 0;
        while (fast != null && fast.next != null) {
            current = current.next;
            fast = fast.next.next;
            count++;
        }

        // Save middle and reset current to head.
        ListNode middle = current;
        current = A;

        // Loop till current doesn't meet middle.
        while (current != middle) {
            // If we have reached the B'th node then break
            if (count == B) break;
            // Else reduce the count and move ahead.
            count--;
            current = current.next;
        }
        // If there are enough nodes then return the node value
        if (count == B) return current.val;
        // else return -1;
        return -1;
    }
}
