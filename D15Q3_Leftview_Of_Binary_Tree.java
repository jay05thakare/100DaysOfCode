// See my solution here
// https://practice.geeksforgeeks.org/viewSol.php?subId=425ba30a9a94e231e79bc6e08b85cffb&pid=700174&user=jay05thakare




/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

/*
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list = new ArrayList<Integer>();
      Queue<Node> q = new LinkedList<>();
      
      if(root == null) return list;
      
      q.add(root);
      q.add(null);
      list.add(root.data);
      
      while(!q.isEmpty()){
          Node curr = q.remove();
          
          if(curr == null){
              if(q.isEmpty()){
                  break;
              }else{
                  q.add(null);
                  Node next = q.peek();
                  list.add(next.data);
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
      
      return list;
    }
}

*/