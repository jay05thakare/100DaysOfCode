public class D21Q4_Range_In_A_BST {
  
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

  // insert to make a BST
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

  // Print range in BST
  public static void printInRange(Node root, int X, int Y) {
    if(root == null){
      return;
    }

    if(root.data >= X && root.data <= Y){
      printInRange(root.left, X, Y);
      System.out.print(root.data + " ");
      printInRange(root.right, X, Y);

    }else if(root.data >= Y){
      printInRange(root.left, X, Y);

    }else{
      printInRange(root.right, X, Y);
    }
  }

  // print BST in inorder sequence
  public static void inorder(Node root) {
    if(root == null){
      return;
    }

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }
  
  // main function
  public static void main(String[] args) {
    int values[] = {8,5,3,1,4,6,10,11,14};
    Node root = null;

    for(int i = 0; i<values.length; i++){
      root = buildBST(root, values[i]);
    }

    // printing inorder traversal of BST
    inorder(root);
    System.out.println();

    // print given range
    printInRange(root, 6, 10);
  }
}
