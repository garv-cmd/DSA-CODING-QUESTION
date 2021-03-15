//Interview Bit
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode start = A, startprev = null;
    int n = B;
    
    while(start!=null && --n>0){
        startprev = start;
        start = start.next;
    }
    
    ListNode current = start, next = null, prev = null;
    n = C - B;
    while(current!=null && n>=0){
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        
        n--;
    }
    
    if(startprev!=null)
      startprev.next = prev;
    else
      A = prev;
    
    start.next = current;
    
    return A;
    }
}
