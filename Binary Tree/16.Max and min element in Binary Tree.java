//https://practice.geeksforgeeks.org/problems/max-and-min-element-in-binary-tree/1#
class GFG
{
	public static int findMax(Node node)
	{
	    //Add your code here.
	    if(node == null){
         return Integer.MIN_VALUE;
    }
    int m1 = findMax(node.left);
    int m2 = findMax(node.right);
    int m= Math.max(node.data,Math.max(m1,m2));
    return m;
    }
	public static int findMin(Node node)
	{
	    //Add your code here.
	    if(node == null){
         return Integer.MAX_VALUE;
    }
    int m1 = findMin(node.left);
    int m2 = findMin(node.right);
    int m= Math.min(node.data,Math.min(m1,m2));
    return m;
	}
}
