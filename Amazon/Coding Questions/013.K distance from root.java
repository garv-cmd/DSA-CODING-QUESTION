//https://practice.geeksforgeeks.org/problems/k-distance-from-root/1/?company[]=Amazon&company[]=Amazon&problemStatus=solved&page=1&query=company[]AmazonproblemStatussolvedpage1company[]Amazon
class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          // Your code here
           ArrayList<Integer> al = new ArrayList<>();
           getAns(al,root,k);
           return al;
     }
     public static void getAns( ArrayList<Integer> al,Node node,int k){
         if(node==null)
         return;
         if(k==0){
             al.add(node.data);
         }
         getAns(al,node.left,k-1);
         getAns(al,node.right,k-1);
     }
}
