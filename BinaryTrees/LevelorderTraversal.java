package BinaryTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LevelorderTraversal {
  public List<List<Integer>> levelOrder(TreeNode root) {
    if(root==null){
      return new ArrayList<>();
    }
    List<List<Integer>> res = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while(!queue.isEmpty()){
      int size = queue.size();
      List<Integer> temp = new ArrayList<>();
      for(int i=0;i<size;i++){
        TreeNode node = queue.poll();
        temp.add(node.val);
        if(node.left!=null){
          queue.add(node.left);
        }
        if(node.right!=null){
          queue.add(node.right);
        }
      }
      res.add(temp);
    }
    return res;
  }
}
