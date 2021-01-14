//https://practice.geeksforgeeks.org/problems/reverse-level-order-traversal/1#
class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
Queue<Node> queue = new LinkedList<>();
Stack<Node> stack = new Stack<>();
queue.add(node);
while(!queue.isEmpty()){
Node x = queue.peek();
stack.push(x);
if(x.right != null){
queue.add(x.right);
}
if(x.left != null){
queue.add(x.left);
}
queue.poll();
}
while(!stack.empty()){
Node y = stack.pop();
arr.add(y.data);
}
return arr;
    }
}      
