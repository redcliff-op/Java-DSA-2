import java.util.HashMap;
import java.util.HashSet;

public class SubArraySumEqualsK {

  // Brute force

  public int subarraySum(int[] nums, int k) {
    int len = nums.length;
    int count = 0;
    for (int i = 0; i < len; i++) {
      int sum = 0;
      for (int j = i; j < len; j++) {
        sum += nums[j];
        if (sum == k) {
          count++;
        }
      }
    }
    return count;
  }

  // Hashmap (Optimal)

  public int subarraySum2(int[] nums, int k) {
    HashMap<Integer, Integer> prefixSum = new HashMap<>();
    int sum = 0;
    int count = 0;
    prefixSum.put(0, 1);
    for(int elem: nums){
      sum += elem;
      if(prefixSum.containsKey(sum-k)){
        count += prefixSum.get(sum-k);
      }
      prefixSum.put(sum, prefixSum.getOrDefault(sum,0)+1);
    }
    return count;
  }
}
