import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinimumKthElement {

  // Sorting

  public static int kthSmallest(int[] arr, int k) {
    Arrays.sort(arr);
    return arr[k-1];
  }

  // Max Heap

  public static int kthSmallest2(int[] arr, int k) {
    PriorityQueue<Integer> minheap = new PriorityQueue<>(Collections.reverseOrder());
    int len = arr.length;
    for(int i=0;i<len;i++){
      minheap.add(arr[i]);
      if(minheap.size()>k){
        minheap.poll();
      }
    }
    return minheap.peek();
  }  
}
