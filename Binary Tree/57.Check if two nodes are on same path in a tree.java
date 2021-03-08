boolean flag;
boolean check(Node root,int a,int b){
Node lca = LCA(root,a,b);
  flag = true;
  return flag;
}
Node lca(Node root,int a,int b){
if(root==null)
		return null;
		if(root.data==n1 || root.data==n2){
		    return root;
		}
		Node l = lca(root.left,n1,n2);
		Node r = lca(root.right,n1,n2);
		if(l!=null && r!=null){
      flag = false;
      return root;
    }
		
		if(l!=null)
		return l;
		if(r!=null)
		return r;
		return null;
}
