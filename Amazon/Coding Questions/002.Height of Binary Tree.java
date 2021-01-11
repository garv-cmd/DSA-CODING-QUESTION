//https://practice.geeksforgeeks.org/problems/height-of-binary-tree/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
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
