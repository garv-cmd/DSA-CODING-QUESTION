//https://practice.geeksforgeeks.org/problems/preorder-traversal/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class BinaryTree
{
    /* Computes the number of nodes in a tree. */
    static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        ArrayList<Integer> al = new ArrayList<>();
        getAns(al,root);
        return al;
    }
    public static void getAns(ArrayList<Integer> al,Node node){
        if(node==null)
        return;
        al.add(node.data);
        getAns(al,node.left);
        getAns(al,node.right);
    }

}
