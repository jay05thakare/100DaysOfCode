public class D21Q2_Search_In_BST {
  
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

  // Insert in BST
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

  // Search in BST
  public static boolean searchBST(Node root, int key) {
    if(root == null){
      return false;
    }

    if(root.data > key){// left subtree
      return searchBST(root.left, key);
    }else if(root.data == key){// found key
      return true;
    }else{// right subtree
      return searchBST(root.right, key);
    }
  }

  // print BST
  public static void inorder(Node root) {
    if(root == null){
      return;
    }

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }
  
  public static void main(String[] args) {
    int values[] = {5,1,3,4,2,7};
    Node root = null;

    for(int i = 0; i<values.length; i++){
      root = buildBST(root, values[i]);
    }

    // printing inorder traversal of BST
    System.out.print("BST is: ");
    inorder(root);
    System.out.println();

    // search result
    int key = 12;
    if(searchBST(root, key)){
      System.out.println("Key " + key + " Found");
    }else{
      System.out.println("Key " + key +" Not found");
    }
  }
}
