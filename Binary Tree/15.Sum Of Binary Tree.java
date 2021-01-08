//https://practice.geeksforgeeks.org/problems/sum-of-binary-tree/1#
class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head==null)
        return 0;
        return sumBT(head.left)+sumBT(head.right)+head.data;
    }
}
