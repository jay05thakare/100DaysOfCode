// Check if Tree is Isomorphic
// See full code here
// https://practice.geeksforgeeks.org/viewSol.php?subId=d001df7b328536fdf3efba255d120068&pid=700609&user=jay05thakare



// Two trees are called isomorphic if one can be obtained from another by a series of flips, 
// i.e. by swapping left and right children of several nodes. 
// Any number of nodes at any level can have their children swapped. 
// Two empty trees are isomorphic.



/*
 * class Solution  
{ 
    // Return True if the given trees are isomotphic. Else return False.
    boolean isIsomorphic(Node root1, Node root2)  
    { 
         // code here.
         if(root1 == null && root2 == null) return true;
         if(root1 == null || root2 == null) return false;
         
         if(root1.data != root2.data) return false;
         
         boolean a = isIsomorphic(root1.left, root2.left) && isIsomorphic(root1.right, root2.right);
         boolean b = isIsomorphic(root1.left, root2.right) && isIsomorphic(root1.right, root2.left);
         
         return a || b;
    }
    
}    
 */