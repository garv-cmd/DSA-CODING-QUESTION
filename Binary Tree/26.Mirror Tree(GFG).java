//https://practice.geeksforgeeks.org/problems/mirror-tree/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&page=1&query=category[]TreeproblemStatusunsolvedpage1category[]Tree#
class Tree
{
    void mirror(Node node)
    {
	// Your code here
	if(node!=null){
	    mirror(node.left);
	    mirror(node.right);
	    Node temp = node.left;
	    node.left = node.right;
	    node.right = temp;
	}
	
    }
}
