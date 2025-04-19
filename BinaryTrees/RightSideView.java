package BinaryTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
  public List<Integer> rightSideView(TreeNode root) {
    if(root==null){
      return new ArrayList<>();
    }
    List<Integer> res = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while(!queue.isEmpty()){
      int size = queue.size();
      for(int i=0;i<size;i++){
        TreeNode node = queue.poll();
        if (node.left != null) {
          queue.add(node.left);
        }
        if (node.right != null) {
          queue.add(node.right);
        }
        if(i==size-1){
          res.add(node.val);
        }
      }
    }
    return res;      
  }
}
