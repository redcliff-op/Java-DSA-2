package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    return inorderTraversalHelper(root, res);
  }

  public List<Integer> inorderTraversalHelper(TreeNode root, List<Integer> res) {
    if(root==null){
      return res;
    }
    inorderTraversalHelper(root.left, res);
    res.add(root.val);
    inorderTraversalHelper(root.right, res);
    return res;
  }
}
