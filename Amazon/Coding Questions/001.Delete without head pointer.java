//https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1/?company[]=Amazon
class GfG
{
    void deleteNode(Node node)
    {
         node.data=node.next.data;
node.next=node.next.next;
    }
}
