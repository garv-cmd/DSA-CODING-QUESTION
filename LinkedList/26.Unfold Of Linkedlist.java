import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
     public static ListNode reverse(ListNode head) {
        
        if(head==null || head.next==null)
        return head;
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr!=null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
      
        return prev;
    }

    public static void unfold(ListNode head) {
        if(head==null || head.next==null)
        return;
        
        ListNode fh = head;//first head
        ListNode fp = fh;//first prev
        ListNode sh = head.next;//second head
        ListNode sp = sh;//sec prev
        
        while(sp!=null && sp.next!=null)
        {
            ListNode f = sp.next; //backup
            
            fp.next = f;
            sp.next = f.next;
            
            fp=fp.next;
            sp=sp.next;
        }
        fp.next = null;
        sh = reverse(sh);
        fp.next = sh;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}
