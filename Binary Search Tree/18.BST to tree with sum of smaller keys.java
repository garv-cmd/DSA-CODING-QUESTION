https://www.geeksforgeeks.org/bst-tree-sum-smaller-keys/
void addSmallerUtil(Node node, Sum sum) 
    { 
  
        // Base Case 
        if (node == null) { 
            return; 
        } 
        addSmallerUtil(node.left, sum); 
  
        // Update the value at sum 
        sum.addvalue = sum.addvalue + node.data; 
  
        // Update key of this Node 
        node.data = sum.addvalue; 
  
        // Recur for right subtree so that the  
        // updated sum is added to greater Nodes 
        addSmallerUtil(node.right, sum); 
    } 
