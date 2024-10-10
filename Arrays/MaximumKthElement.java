import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumKthElement {

  // Sorting 

  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    return nums[nums.length - k];
  }

  // Min Heap
  public int findKthLargest2(int[] nums, int k) {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    int len = nums.length;
    for(int i=0;i<len;i++){
      minheap.add(nums[i]);
      if(minheap.size()>k){
        minheap.poll();
      }
    }
    return minheap.peek();
  }
}
