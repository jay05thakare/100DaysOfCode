// see full code here
// https://practice.geeksforgeeks.org/viewSol.php?subId=4cba5312468a3b5f242d5e7af12f281c&pid=700185&user=jay05thakare


// Given a Binary Tree of size N , where each node can have positive or negative values. 
// Convert this to a tree where each node contains the sum of the left and right sub trees of the original tree. 
// The values of leaf nodes are changed to 0.


/*
class Solution{
  int solve(Node root){
      if(root == null) return 0;
      
      int a = solve(root.left);
      int b = solve(root.right);
      int x = root.data;
      
      root.data = a+b;
      return a+b+x;
  }
  public void toSumTree(Node root){
       //add code here.
       solve(root);
  }
}
*/