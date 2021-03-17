leetcode - 1008
class Solution {
    int ptr;
    public TreeNode bstFromPreorder(int[] preorder) {
        ptr = 0;
        return makeTree(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    TreeNode makeTree(int []arr,int l,int r){
        if(ptr >= arr.length)
            return null;
        int x = arr[ptr];
        if(l>r)
            return null;
        if(arr[ptr]<l || arr[ptr]>r){
            return null;
        }
        TreeNode root = new TreeNode(arr[ptr]);
        ptr++;
        root.left = makeTree(arr,1,x-1);
        root.right = makeTree(arr,x+1,r);
        return root;
    }
}
