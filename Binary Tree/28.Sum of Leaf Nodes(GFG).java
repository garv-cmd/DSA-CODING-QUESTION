//
class GfG
{
   
    public int SumofLeafNodes(Node node)
    {
        // your code here
        if(node==null)
        return 0;
         if(node.left==null && node.right==null){
             return node.data;
         }
         return SumofLeafNodes(node.left)+SumofLeafNodes(node.right);
    }
   
}
