//https://practice.geeksforgeeks.org/problems/print-all-nodes-that-dont-have-sibling/1#
class Tree
{   ArrayList<Integer>al = new ArrayList<>();
    ArrayList<Integer> noSibling(Node node)
    {
        // code here
        getAns(node,null);
        if(al.size()==0)
        al.add(-1);
        Collections.sort(al);
        return al;
    }
    public void getAns(Node node,Node parent){
        if(node==null)
        return;
        if(parent!=null && parent.left==node && parent.right==null){
            al.add(node.data);
        }if(parent!=null && parent.right==node && parent.left==null){
            al.add(node.data);
        }
        getAns(node.left,node);
        getAns(node.right,node);
    }
    
}
