https://practice.geeksforgeeks.org/problems/largest-bst/1#

class Solution{
static class pair {
boolean ans;
int size , max , min , lsize;
pair(boolean ans , int max , int min , int size) {
this.ans = ans;
this.max = max;
this.min = min;
this.size = size;
}
}
static pair result(Node root) {
pair p;
if(root == null)
p = new pair(true , Integer.MIN_VALUE , Integer.MAX_VALUE , 0 );
else {
pair l = result(root.left);
pair r = result(root.right);
if(l.ans && r.ans && (root.data > l.max && root.data < r.min))
p = new pair(true , Math.max(r.max , root.data) , Math.min(l.min , root.data) , l.size + r.size + 1 );
else
p = new pair(false , Integer.MIN_VALUE , Integer.MAX_VALUE , Math.max(l.size , r.size));
}
return p;
}
static int largestBst(Node root)
{
pair p = result(root);
return p.size;
}

}
