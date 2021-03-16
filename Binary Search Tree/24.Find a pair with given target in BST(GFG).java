https://practice.geeksforgeeks.org/problems/find-a-pair-with-given-target-in-bst/1
class Solution
{
    // root : the root Node of the given BST
    // target : the target sum
    ArrayList<Integer>al;
    public int isPairPresent(Node root, int target)
    {
        // Write your code here
        al = new ArrayList<>();
        inorder(root);
        int i=0,j=al.size()-1;
        while(i<j){
            int sum = al.get(i)+al.get(j);
            if(sum < target)
            i++;
            else if(sum > target)
            j--;
            else {
                return 1;
            }
            }
            
        return 0;
    }
    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
}
