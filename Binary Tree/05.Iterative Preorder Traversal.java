//https://practice.geeksforgeeks.org/problems/preorder-traversal/1#
class BinaryTree
{
    /* Computes the number of nodes in a tree. */
  public static class Pair{
      Node node;
      int state;
      Pair(Node node,int state){
          this.node = node;
          this.state=state;
      }
  }
    static ArrayList<Integer> preorder(Node node)
    {
         ArrayList<Integer> al = new ArrayList<>();
         Stack<Pair> st = new Stack<>();
        Pair np = new Pair(node,1);
        st.push(np);
        
        while(st.size()>0){
            Pair top = st.peek();
            if(top.state==1){
                al.add(top.node.data);
                top.state++;
                if(top.node.left!=null){
                    Pair lp = new Pair(top.node.left,1);
                    st.push(lp);
                }
            }else if(top.state==2){
               
                top.state++;
                if(top.node.right!=null){
                    Pair lp = new Pair(top.node.right,1);
                    st.push(lp);
                }
            }else{
                
                 st.pop();
            }
        }
       
        return al;
    }

}
