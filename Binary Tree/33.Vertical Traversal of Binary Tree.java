//https://practice.geeksforgeeks.org/problems/print-a-binary-tree-in-vertical-order/1
class BinaryTree
{
    static class Pair{
        Node node;
        int hd;
        Pair(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    static ArrayList <Integer> verticalOrder(Node root)
    {
        Queue<Pair> q = new LinkedList<>();
       ArrayList<Integer>res = new ArrayList<>();
        q.add(new Pair(root,0));
        TreeMap<Integer,ArrayList<Integer>> map = new TreeMap<>();
        while(q.size()>0){
            Pair p = q.remove();
            Node n = p.node;
            int hd = p.hd;
            if(map.containsKey(hd)){
                ArrayList<Integer> a = map.get(hd);
                a.add(n.data);
                map.put(hd,a);
            }else{
                 ArrayList<Integer> a = new ArrayList<>();
                a.add(n.data);
                map.put(hd,a);
            }
            if(n.left!=null)
                q.add(new Pair(n.left,hd-1));
            
            if(n.right!=null)
                q.add(new Pair(n.right,hd+1));
        }
        for(int k : map.keySet()){
            for(int val:map.get(k))
            res.add(val);
        }
        return res;
    }
}
