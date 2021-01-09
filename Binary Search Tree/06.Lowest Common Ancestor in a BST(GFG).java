//https://practice.geeksforgeeks.org/problems/lowest-common-ancestor-in-a-bst/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&page=1&query=category[]TreeproblemStatusunsolvedpage1category[]Tree#
class BST
{   
    // Returns the LCA of the nodes with values n1 and n2
    // in the BST rooted at 'root' 
	Node LCA(Node node, int d1, int d2)
	{
        // code here.  
         if (d1 < node.data && d2 < node.data) {
            return LCA(node.left, d1, d2);
        } else if (d1 > node.data && d2 > node.data) {
            return LCA(node.right, d1, d2);
        } else
            return node;
    }
    
}
