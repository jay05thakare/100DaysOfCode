// Lowest Common Ancestor of a Binary Search Tree
// find my full code here
// https://leetcode.com/submissions/detail/776663245/



/*
 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root.val == p.val || root.val == q.val) return root;
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if(left == null) return right;
        if(right == null) return left;
        
        return root;
    }
 */