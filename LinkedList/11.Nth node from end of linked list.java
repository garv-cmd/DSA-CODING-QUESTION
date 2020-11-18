//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
class GfG
{
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node temp = head;
    	int c=0;
    	while(temp!=null){
    	    c++;
    	    temp = temp.next;
    	}
    	int res = c-n;
    	int i=0;
    	Node t = head;
    	if(res<0)
    	return -1;
    	else{
    	    	while(t!=null){
    	   
    	    if(i==res){
    	        break;
    	    }
    	     i++;
    	     t = t.next;
    	    
    	}
    		return (int)t.data;
    	}
    
    
    }
}
