//https://practice.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1#
class Merge
{
    
    Node mergeKList(Node[]a,int N)
    {
      PriorityQueue<Integer> minHeap = new PriorityQueue<>();
      
      for(int i=0;i<a.length;i++)
      {
          Node temp = a[i];
          while(temp!=null)
          {
              minHeap.add(temp.data);
              temp = temp.next;
          }
      }

      Node newhead = new Node(-1);
      Node temp = newhead;
      while(!minHeap.isEmpty())
      {
          temp.next = new Node(minHeap.remove());
          temp = temp.next;
      }
      
      return newhead.next; 
    }
}
