// check out my full code here
// https://leetcode.com/submissions/detail/762871260/




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
  public List<List<Integer>> levelOrder(TreeNode root) {
      Queue<TreeNode> q = new LinkedList<>();
      List<List<Integer>> arrCol = new ArrayList<List<Integer>>();
      
      if(root == null){
          return arrCol;
      }
      
      q.add(root);
      
      while(!q.isEmpty()){
          int size = q.size();
          List<Integer> arrRow = new ArrayList<Integer>();
          
          for(int i = 0; i<size; i++){
              TreeNode curr = q.remove();
              arrRow.add(curr.val);
              
              if(curr.left != null){
                  q.add(curr.left);
              }
              if(curr.right != null){
                  q.add(curr.right);
              }
          }
          
          arrCol.add(arrRow);
          
          
      }
      return arrCol;
  }
}
*/