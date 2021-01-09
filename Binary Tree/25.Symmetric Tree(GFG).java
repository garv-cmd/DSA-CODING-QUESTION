//https://practice.geeksforgeeks.org/problems/symmetric-tree/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&page=1&query=category[]TreeproblemStatusunsolvedpage1category[]Tree
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not\
    public static boolean isMirror(Node l,Node r){
        if(l==null && r==null)
        return true;
        if(l==null || r==null)
        return false;
        if(l.data==r.data){
            return isMirror(l.left,r.right)&&isMirror(l.right,r.left);
        }else return false;
    }
    
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root==null)
        return true;
        return isMirror(root.left,root.right);
    }
}
