package BinaryTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    if(root==null){
      return new ArrayList<>();
    }
    List<List<Integer>> res = new ArrayList<>();
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    boolean reverse = false;
    while(!queue.isEmpty()){
      int size = queue.size();
      List<Integer> temp = new ArrayList<>();
      for(int i=0;i<size;i++){
        TreeNode node = queue.poll();
        if(!reverse){
          temp.add(node.val);
        }else{
          temp.add(0,node.val);
        }
        if(node.left!=null){
          queue.add(node.left);
        }
        if(node.right!=null){
          queue.add(node.right);
        }
      }
      res.add(temp);
      reverse = !reverse;
    }
    return res;      
  }
}
