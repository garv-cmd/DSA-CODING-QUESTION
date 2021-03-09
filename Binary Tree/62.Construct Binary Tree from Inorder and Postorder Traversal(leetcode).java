leetcode - 106
class Solution {
    int curr;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        curr= inorder.length -1;
        return bt(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode bt(int []in,int []post,int inS,int inE){
        if(inS > inE)
            return null;
        TreeNode root =new TreeNode(post[curr]);
        int ind = 0;
        for(int i=inS;i<=inE;i++){
            if(root.val == in[i]){
                ind = i;
                break;
            }
        }
        curr--;
        root.right= bt(in,post,ind+1,inE);
        root.left = bt(in,post,inS,ind-1);
        return root;
        
    }
}
