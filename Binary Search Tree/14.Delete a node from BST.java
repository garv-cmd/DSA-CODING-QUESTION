	//https://practice.geeksforgeeks.org/problems/delete-a-node-from-bst/1#
  static Node getSucc(Node curr) {
curr = curr.left;

while (curr != null && curr.right != null) {
curr = curr.right;
}

return curr;}
    // Return the root of the modified BST after deleting the node with value X
	public static Node deleteNode(Node root, int X)
	{

	
	if (root == null) return null;

if (root.data < X) {
root.right = deleteNode(root.right, X);
} else if (root.data > X) {
root.left = deleteNode(root.left, X);
} else {
if (root.left == null) return root.right;
else if (root.right == null) return root.left;

else {
Node succ = getSucc(root);

root.data = succ.data;

root.left = deleteNode(root.left, succ.data);
}
}
return root;
}
