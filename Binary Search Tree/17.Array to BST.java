https://practice.geeksforgeeks.org/problems/array-to-bst4443/1
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
    }
}
class Solution
{   int arr[];
int i;
    public int[] sortedArrayToBST(int[] nums)
    {
        // Code here 
        Node root = bst(nums,0,nums.length-1);
        arr = new int[nums.length];
        i=0;
        preorder(root);
        return arr;
    }
    
    void preorder(Node root){
        if(root==null)
        return;
        arr[i++] = root.data;
        preorder(root.left);
        preorder(root.right);
    }
    
    Node bst(int []nums,int l,int r){
        if(l>r)
        return null;
        int mid = (l+r)/2;
        Node root = new Node(nums[mid]);
        root.left = bst(nums,l,mid-1);
        root.right = bst(nums,mid+1,r);
        return root;
        
    }
}
