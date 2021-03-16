https://practice.geeksforgeeks.org/problems/check-whether-bst-contains-dead-end/1#
class GFG
{   static boolean flag;
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        int l = 1;
        int r = Integer.MAX_VALUE;
        flag=false;
        util(root,l,r);
        return flag;
    }
    static void util(Node root,int l,int r){
        if(root==null)
        return;
        if(flag)
        return;
        if(root.left==null && root.right==null){
        if(l==r)
        {
            flag=true;
            return;
        }
        
        }
        util(root.left,l,root.data-1);
        util(root.right,root.data+1,r);
    }
}
