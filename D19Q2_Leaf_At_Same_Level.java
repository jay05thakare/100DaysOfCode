// see my solution here
// https://practice.geeksforgeeks.org/viewSol.php?subId=5247a0b80afa7f9a6e7a4ae111145b79&pid=700307&user=jay05thakare




/*
{
  int levelOfLeaf;
  
  public boolean solve(Node node, int level){
      if(node == null){
          return true;
      }
      
      if(node.left == null && node.right == null){
          if(levelOfLeaf == 0){
              levelOfLeaf = level;
              return true;
          }
          return levelOfLeaf == level;
      }
      
      return solve(node.left, level + 1) && solve(node.right, level + 1);
  }

  boolean check(Node root)
  {
// Your code here
return solve(root, 1);
  }
}
*/