// See my full code here
// https://practice.geeksforgeeks.org/viewSol.php?subId=aeb7d3c9f284899864223ee14043f733&pid=700153&user=jay05thakare






//User function Template for Java


/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

/*
class Solution{
  //Function to return list containing elements of right view of binary tree.
  ArrayList<Integer> rightView(Node root) {
      
  //add code here.
   ArrayList<Integer> list = new ArrayList<>();
    
    if (root == null) {
          return list;
      }

      Queue<Node> q = new LinkedList<>();
      q.add(root);

      while (!q.isEmpty()) {

          // get number of nodes for each level
          int n = q.size();

          // traverse all the nodes of the current level
          for (int i = 0; i < n; i++) {
              Node curr = q.peek();
              q.remove();

              // print the last node of each level
              if (i == n - 1) {
                  list.add(curr.data);
              }

              // if left child is not null add it into
              // the
              // queue
              if (curr.left != null) {
                  q.add(curr.left);
              }

              // if right child is not null add it into
              // the
              // queue
              if (curr.right != null) {
                  q.add(curr.right);
              }
          }
  }
  return list;
  }
}
*/