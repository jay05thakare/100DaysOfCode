// find my full solution here:
// https://leetcode.com/submissions/detail/760552007/



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
  public int maxDepth(TreeNode root) {
      if(root == null){
          return 0;
      }
      
      Queue<TreeNode> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      int count = 0;
      
      while(!q.isEmpty()){
          TreeNode curr = q.remove();
          if(curr == null){
              count++;
              
              if(q.isEmpty()){
                  break;
              }else{
                  q.add(null);
              }
          }else{
              if(curr.left != null){
                  q.add(curr.left);
              }
              
              if(curr.right != null){
                  q.add(curr.right);
              }
          }
      }
      return count;
  }
}
*/