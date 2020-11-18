//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
// recursion solution
Node reverseList(Node head)
    {
        // code here
       if(head.next == null){
           return head;
       }
       Node newHead = reverseList(head.next);
       head.next.next = head;
       head.next = null;
       return newHead;
       
    }
