//
class Solution
{
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here
        return bt(inorder, preorder, 0,0,n-1);
    }
    
    static Node bt(int[] in, int[] pre, int preI, int inS, int inE)
    {
        if(preI > pre.length-1 || inS>inE)
            return null;
            
        Node root = new Node(pre[preI]);
        
        int index =0;
        for(int i = inS ; i<= inE; i++)
        {
            if(root.data == in[i])
            {
                index = i;
            }
        }
        
        root.left  = bt(in, pre, preI + 1 , inS, index - 1);
        root.right = bt(in, pre, preI + index - inS + 1, index + 1, inE);
        
        return root;
      
    }
}
