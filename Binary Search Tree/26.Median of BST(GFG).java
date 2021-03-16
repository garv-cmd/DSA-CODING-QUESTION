https://practice.geeksforgeeks.org/problems/median-of-bst/1#//
class Tree
{
     static ArrayList<Integer>al;
    public static void findMedian(Node root)
    {
        // code here.
        if(root==null){
             System.out.println(-1);
             return;
        }
        al = new ArrayList<>();
        inorder(root);
        int sum=0;
        int len = al.size();
        if(al.size()%2==0){
           // if(al.get(0)==
            sum=al.get((len-1)/2)+al.get((len)/2);
            if(sum%2==0)
            System.out.print(sum/2);
            else System.out.print(sum/2.0);
            return;
        }else{
           System.out.print(al.get(len/2));
        }
    }
    public static void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        al.add(root.data);
        inorder(root.right);
    }
}
