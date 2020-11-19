//https://practice.geeksforgeeks.org/problems/circular-linked-list/1#
class GfG
{
    boolean isCircular(Node head)
    {
	// Your code here	
	Node temp = head;

	if(head==null)
	return true;
	
	while(temp.next!=null){
	    if(temp.next==head){
	        return true;
	    }
	    temp = temp.next;
	}
	return false;
	
    }
}
