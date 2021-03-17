https://www.geeksforgeeks.org/transform-bst-sum-tree/
// Java program to transform a BST to sum tree
import java.io.*;
class Node
{
int data;
Node left, right;

// A utility function to create a new Binary Tree Node
Node(int item)
{
	data = item;
	left = right = null;
}
}

class GFG
{

static int sum = 0;
static Node Root;

// Recursive function to transform a BST to sum tree.
// This function traverses the tree in reverse inorder so
// that we have visited all greater key nodes of the currently
// visited node 
static void transformTreeUtil(Node root)
{

	// Base case
	if (root == null) 
	return;

	// Recur for right subtree
	transformTreeUtil(root.right);

	// Update sum
	sum = sum + root.data;

	// Store old sum in current node
	root.data = sum - root.data;

	// Recur for left subtree
	transformTreeUtil(root.left);
}

// A wrapper over transformTreeUtil()
static void transformTree(Node root)
{

	transformTreeUtil(root);
}

// A utility function to print indorder traversal of a
// binary tree
static void printInorder(Node root)
{
	if (root == null)
	return;
	printInorder(root.left);
	System.out.print(root.data + " ");
	printInorder(root.right);
}

// Driver Program to test above functions
public static void main (String[] args) {

	GFG.Root = new Node(11);
	GFG.Root.left = new Node(2);
	GFG.Root.right = new Node(29);
	GFG.Root.left.left = new Node(1);
	GFG.Root.left.right = new Node(7);
	GFG.Root.right.left = new Node(15);
	GFG.Root.right.right = new Node(40);
	GFG.Root.right.right.left = new Node(35);

	System.out.println("Inorder Traversal of given tree");
	printInorder(Root);

	transformTree(Root);
	System.out.println("\n\nInorder Traversal of transformed tree");
	printInorder(Root);
}
}

// This code is contributed by avanitrachhadiya2155
