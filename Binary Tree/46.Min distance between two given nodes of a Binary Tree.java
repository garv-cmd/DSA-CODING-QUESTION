//https://practice.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1#
class GfG {
    int findDist(Node root, int a, int b) {
        // Your code here
        Node LCA = lca(root,a,b);
        int res = dist(LCA,a,0)+dist(LCA,b,0);
        return res;
        
    }
    int dist(Node root,int num,int d){
        if(root==null)
        return -1;
        if(root.data==num)
        return d;
        int l = dist(root.left,num,d+1);
        int r = dist(root.right,num,d+1);
        
        return Math.max(l,r);
    }
    Node lca(Node root, int n1,int n2)
	{
		// Your code here
		if(root==null)
		return null;
		if(root.data==n1 || root.data==n2){
		    return root;
		}
		Node l = lca(root.left,n1,n2);
		Node r = lca(root.right,n1,n2);
		if(l!=null && r!=null)
		return root;
		if(l!=null)
		return l;
		if(r!=null)
		return r;
		return null;
	}
}
