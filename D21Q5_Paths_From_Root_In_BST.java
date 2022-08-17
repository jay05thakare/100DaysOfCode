import java.util.*;

public class D21Q5_Paths_From_Root_In_BST {
  
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

  public static void printPath(ArrayList<Integer> path) {
    for(int i = 0; i<path.size(); i++){
      System.out.print(path.get(i) + "->");
    }
    System.out.println();
  }
  // print roof to leaf
  public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
    if(root == null){
      return;
    }

    path.add(root.data);

    // leaf
    if(root.left == null && root.right == null){
      printPath(path);
    }else{
      printRootToLeaf(root.left, path);
      printRootToLeaf(root.right, path);
    }
    
    path.remove(path.size()-1);
  }

  // printing inorder sequence
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
    int values[] = {8,5,3,6,10,11,14};
    Node root = null;

    for(int i = 0; i<values.length; i++){
      root = buildBST(root, values[i]);
    }

    // printing inorder traversal of BST
    inorder(root);
    System.out.println();

    // print all paths from root
    printRootToLeaf(root, new ArrayList<>());
  }
}
