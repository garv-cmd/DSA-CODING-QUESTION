//https://practice.geeksforgeeks.org/problems/mirror-tree/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
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
