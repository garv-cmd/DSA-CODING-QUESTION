//https://practice.geeksforgeeks.org/problems/serialize-and-deserialize-a-binary-tree/1
class Tree {
	public void serialize(Node root, ArrayList<Integer> A) {
	    if(root==null){
	        A.add(-1);
	        return;
	    }
	    A.add(root.data);
	    serialize(root.left,A);
	    serialize(root.right,A);
	}
	int curr;
    public Node deSerialize(ArrayList<Integer> A){
        curr=0;
       return des(A);
    }
    public Node des(ArrayList<Integer> A){
        if(A.get(curr)==-1){
            curr++;
            return null;
        }
        Node n = new Node(A.get(curr));
        curr++;
        n.left = des(A);
        n.right = des(A);
        return n;
    }
    
    
    
    
    
};
