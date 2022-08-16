// Check for Balanced Tree
// See my full code here
// https://practice.geeksforgeeks.org/viewSol.php?subId=0b42783a81879bf32b2c4dc1050050c6&pid=700166&user=jay05thakare



/*
//Function to check whether a binary tree is balanced or not.
int dfsHeight(Node root){
  if(root == null) return 0;
  
  int leftHeight = dfsHeight(root.left);
  if(leftHeight == -1) return -1;
  int rightHeight = dfsHeight(root.right);
  if(rightHeight == -1) return -1;
  
  if(Math.abs(rightHeight - leftHeight) > 1) return -1;
  return (Math.max(leftHeight, rightHeight) + 1);
}

boolean isBalanced(Node root)
{
// Your code here
return dfsHeight(root) != -1;
}
*/
