https://practice.geeksforgeeks.org/problems/kth-largest-element-in-bst/1
class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    int v;
    int k;
    public int kthLargest(Node root, int K) 
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
        getAns(root.right);
        k--;
        if(k==0){
            v=root.data;
            return;
        }
        getAns(root.left);
    }
}
