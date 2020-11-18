//https://practice.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1
class GfG
{
    // Function to remove duplicates from the given linked list
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         Node temp = head;
         Node t = head;
         Set<Integer> set = new LinkedHashSet<>();
         while(temp!=null){
         set.add((int)temp.data);
             temp = temp.next;
         }
     
     
         Iterator<Integer> i = set.iterator(); 
         int q=0;
        while (i.hasNext()) {
            q++;
             t.data=(int)i.next(); 
             t = t.next;
        }
        Node fn = head;
            while(q--!=1){
                fn=fn.next;
            }
         fn.next = null;
         return head;
    }
}
