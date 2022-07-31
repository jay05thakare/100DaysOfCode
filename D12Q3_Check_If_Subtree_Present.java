// Find my solution here
// https://leetcode.com/submissions/detail/761207109/




/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
/*
class Solution {
  boolean areIdentical(TreeNode root1, TreeNode root2)
  {

      //  base cases 
      if (root1 == null && root2 == null)
          return true;

      if (root1 == null || root2 == null)
          return false;

      // Check if the data of both roots is same and data of left and right
        //  subtrees are also same
      return (root1.val == root2.val
              && areIdentical(root1.left, root2.left)
              && areIdentical(root1.right, root2.right));
  }
  
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if (subRoot == null)
          return true;

      if (root == null)
          return false;

      // Check the tree with root as current node
      if (areIdentical(root, subRoot))
          return true;

      // If the tree with root as current node doesn't match then
         try left and right subtrees one by one
      return isSubtree(root.left, subRoot)
              || isSubtree(root.right, subRoot);
  }
}
*/