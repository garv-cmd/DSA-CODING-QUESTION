int v;
    int k;
    public int KthSmallestElement(Node root, int K) 
    {
        // Write your code here
        v=-1;
        k=K;
        getAns(root);
       
        return v;
    }
    public void getAns(Node root){
        if(root==null)
        return;
        if(k<=0)return;
        getAns(root.left);
        k--;
        if(k==0){
            v=root.data;
            return;
        }
        getAns(root.right);
    }
