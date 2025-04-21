package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

  // Iterative ( Worse )

  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root.left);
    queue.add(root.right);
    while (!queue.isEmpty()) {
      TreeNode left = queue.poll();
      TreeNode right = queue.poll();
      if (left == null && right == null) {
        continue;
      }
      if (left == null || right == null || left.val != right.val) {
        return false;
      }
      queue.add(left.left);
      queue.add(right.right);
      queue.add(left.right);
      queue.add(right.left);
    }
    return true;
  }

  // Recursive ( Optimal )
  
  public boolean isSymmetric2(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isSymmetric2Helper(root.left, root.right);
  }

  public boolean isSymmetric2Helper(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    } else if (left == null || right == null) {
      return false;
    } else if (left.val != right.val) {
      return false;
    }
    return isSymmetric2Helper(left.left, right.right) && isSymmetric2Helper(left.right, right.left);
  }
}
