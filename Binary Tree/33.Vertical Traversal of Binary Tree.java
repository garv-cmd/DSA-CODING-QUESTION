//https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
class BinaryTree
{
static class pair {
Node root;
int level ;
pair(int l , Node root) {
this.root = root;
level = l;
}
}
static ArrayList <Integer> verticalOrder(Node root)
{
    ArrayList <Integer> list = new ArrayList <>();
    if(root == null) return list;
        TreeMap<Integer , ArrayList<Integer>> map = new TreeMap<>();
    Queue<pair> q = new LinkedList<>();
    q.add(new pair(0 , root));
while(!q.isEmpty()) {
    pair p = q.remove();
    
    ArrayList <Integer> list1 = map.get(p.level);
    if(list1 == null) list1 = new ArrayList <Integer>();
        list1.add(p.root.data);
    map.put(p.level , list1);
    if(p.root.left != null) q.add(new pair(p.level - 1 , p.root.left));
    if(p.root.right != null) q.add(new pair(p.level + 1 , p.root.right));
    }
for(Map.Entry<Integer ,ArrayList<Integer>> entry : map.entrySet())
list.addAll(entry.getValue());
return list;
}
}
