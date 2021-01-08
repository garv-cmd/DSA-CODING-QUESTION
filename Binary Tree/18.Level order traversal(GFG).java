//https://practice.geeksforgeeks.org/problems/level-order-traversal/1#
class Level_order_traversal
{
    //You are required to complete this method
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer>al = new ArrayList<>();
        Queue<Node> q = new LinkedList<Node>();
        if(node==null){
            return al;
        }
        if(q.isEmpty()){
            q.add(node);
        }
        while(!q.isEmpty()){
            if(q.peek().left!=null){
                q.add(q.peek().left);
            }
            if(q.peek().right!=null){
               q.add(q.peek().right); 
            }
            al.add(q.peek().data);
            q.remove();
    }
    return al;
}
}
