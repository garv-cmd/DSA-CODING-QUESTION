https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1#
 Node merge(Node a,Node b){
        Node temp = new Node(0);
        Node res = temp;
        
        while(a!=null && b!=null){
            if(a.data < b.data){
                res.bottom = a;
                res = res.bottom;
                a=a.bottom;
            }else{
                res.bottom = b;
                res = res.bottom;
                b=b.bottom;
            }
        }
        if(a!=null) res.bottom = a;
        if(b!=null) res.bottom = b;
        return temp.bottom;
    }
    
    
    Node flatten(Node root)
    {
	// Your code here
	if(root==null || root.next==null) 
	return root;
	
	root.next = flatten(root.next);
	root = merge(root,root.next);
	return root;
	
    }
