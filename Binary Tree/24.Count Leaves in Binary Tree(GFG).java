//https://practice.geeksforgeeks.org/problems/count-leaves-in-binary-tree/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&page=1&query=category[]TreeproblemStatusunsolvedpage1category[]Tree
class Tree
{
    int countLeaves(Node node) 
    {
         // Your code  
         if(node==null)
         return 0;
         if(node.left==null && node.right==null){
             return 1;
         }
         int l = countLeaves(node.left);
         int r = countLeaves(node.right);
         return l+r;
    }
}
