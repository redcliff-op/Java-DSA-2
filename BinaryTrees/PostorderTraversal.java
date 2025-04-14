package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversal {
  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    return postorderTraversalHelper(root, res);
  }

  public List<Integer> postorderTraversalHelper(TreeNode root, List<Integer> res) {
    if(root==null){
      return res;
    }
    postorderTraversalHelper(root.left, res);
    postorderTraversalHelper(root.right, res);
    res.add(root.val);
    return res;
  }
}
