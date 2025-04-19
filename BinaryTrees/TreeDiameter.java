package BinaryTrees;

public class TreeDiameter {
  public int diameter = 0;
  public int diameterOfBinaryTree(TreeNode root) {
    diameterOfBinaryTreeHelper(root);
    return diameter;
  }
  public int diameterOfBinaryTreeHelper(TreeNode root){
    if(root==null){
      return 0;
    }
    int left = diameterOfBinaryTreeHelper(root.left);
    int right = diameterOfBinaryTreeHelper(root.right);
    diameter = Math.max(diameter, left+right);
    return 1 + Math.max(left, right);
  }
}
