//https://practice.geeksforgeeks.org/problems/minimum-element-in-bst/1/?category[]=Tree&category[]=Tree&problemStatus=unsolved&page=1&query=category[]TreeproblemStatusunsolvedpage1category[]Tree
class Tree
{
    int minValue(Node node)
    {
         if (node.left == null) {
            return node.data;
        } else {
            return minValue(node.left);
        }
    
