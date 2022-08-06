// See full code here
// https://practice.geeksforgeeks.org/viewSol.php?subId=18943b9736da5a7ba5b5e63d035c8f14&pid=700155&user=jay05thakare





/*
// Function to convert a binary tree into its mirror tree.
public static Node mirror(Node node) {
  // Your code here
  if(node == null){
      return node;
  }
  
  Node left = mirror(node.left);
  Node right = mirror(node.right);
  
  node.left = right;
  node.right = left;
  
  return node;
}
*/