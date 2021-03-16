https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/1
int count=0;
    int getCount(Node root,int l, int h)
    {
        //Your code here
        count=0;
        getAns(root,l,h);
        return count;
    }
    void getAns(Node root,int l,int r){
        if(root==null)return;
        if(root.data <=r && root.data>=l)
        count++;
        if(l<root.data){
            getAns(root.left,l,r);
        }
        if(r>root.data){
            getAns(root.right,l,r);
        }
    }
