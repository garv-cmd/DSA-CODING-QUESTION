//https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1#
class GfG
{
    // head: head node
    Node removeDuplicates(Node root)
    {
	// Your code here	
	Node temp = root;
	while(temp.next!=null){
	    if(temp.data == temp.next.data){
	        temp.next = temp.next.next;
	        //temp.next = temp.next.next;
	    }else{
	        temp = temp.next;
	    }
	}
	return root;
    }
}
