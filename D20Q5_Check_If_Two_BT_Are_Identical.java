// See full coe here
// https://leetcode.com/submissions/detail/775062704/





/*
 * class Solution {
    public boolean isSameTree(TreeNode a, TreeNode b) {
        
        // 1. both empty 
        if (a == null && b == null)
            return true;
             
        //  2. both non-empty -> compare them 
        if (a != null && b != null)
            return (a.val == b.val
                    && isSameTree(a.left, b.left)
                    && isSameTree(a.right, b.right));
  
        //  3. one empty, one not -> false
        return false;
        
    }
}
 */