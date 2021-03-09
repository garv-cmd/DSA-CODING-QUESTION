//https://practice.geeksforgeeks.org/problems/construct-tree-from-inorder-and-levelorder/1
class GfG
{
    Node Find(int arr[],int L,int R)
    {
        if(L>R)
        return null;
        else
        {
            int index=(L+R)/2;
            Node root=new Node(arr[index]);
            root.left=Find(arr,L,index-1);
            root.right=Find(arr,index+1,R);
            return root;
        }
    }
    Node buildTree(int arr[], int level[])
    {
        return Find(arr,0,arr.length-1);
    }
}
