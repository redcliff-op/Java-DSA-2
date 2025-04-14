package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    return preorderTraversalHelper(root, res);
  }

  public List<Integer> preorderTraversalHelper(TreeNode root, List<Integer> res) {
    if(root==null){
      return res;
    }
    res.add(root.val);
    preorderTraversalHelper(root.left, res);
    preorderTraversalHelper(root.right, res);
    return res;
  }
}
