https://practice.geeksforgeeks.org/problems/binary-tree-to-dll/1#
class Solution
{
    Node tail = null;
    Node head = null;
    Node bToDLL(Node root)
    {
	if(root==null){
	    return null;
	}
	bToDLL(root.left);
	if(head==null){
	    head = root;
	}else{
	    root.left = tail;
	    tail.right = root;
	}
    tail = root;	
		bToDLL(root.right);
		return head;
    }
}
