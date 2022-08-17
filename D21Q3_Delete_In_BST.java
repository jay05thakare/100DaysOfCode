public class D21Q3_Delete_In_BST {
  
  static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  // insert in BST
  public static Node buildBST(Node root, int val) {
    if(root == null){
      root = new Node(val);
      return root;
    }

    if(root.data > val){
      root.left = buildBST(root.left, val);
    }else{
      root.right = buildBST(root.right, val);
    }

    return root;
  }

  // Delete in BST
  public static Node deleteBST(Node root, int val) {
    if(root == null){
      return null;
    }
    
    if(root.data > val){
      root.left = deleteBST(root.left, val);
    }else if(root.data < val){
      root.right = deleteBST(root.right, val);
    }else{
      // case 1
      if(root.left == null && root.right == null){
        return null;
      }

      // case 2
      if(root.left == null){
        return root.right;
      }else if(root.right == null){
        return root.left;
      }

      // case 3
      Node IS = inorderSuccessor(root.right);
      root.data = IS.data;
      root.right = deleteBST(root.right, IS.data);
    }

    return root;
  }

  public static Node inorderSuccessor(Node root) {
    while(root.left != null){
      root = root.left;
    }
    return root;
  }

  // Printing BST in inorder traversal
  public static void inorder(Node root) {
    if(root == null){
      return;
    }

    inorder(root.left);
    System.out.print(root.data);
    inorder(root.right);
  }
  
  public static void main(String[] args) {
    int values[] = {5,1,3,4,2,7};
    Node root = null;

    for(int i = 0; i<values.length; i++){
      root = buildBST(root, values[i]);
    }

    // printing inorder traversal of BST
    inorder(root);
    System.out.println();

    // deleting a value
    deleteBST(root, 4);
    inorder(root);
    System.out.println();
  }
}
