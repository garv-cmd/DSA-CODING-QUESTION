//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1
class Solution {
    int height(Node node) {
        // code here 
        if(node==null)
        return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh,rh)+1;
    }
}
