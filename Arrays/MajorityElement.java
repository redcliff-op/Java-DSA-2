import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    int len = nums.length;
    if (len < 2) {
      return nums[0];
    }
    int target = len / 2;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < len; i++) {
      if (map.containsKey(nums[i])) {
        int res = map.get(nums[i]);
        if (res >= target) {
          return nums[i];
        }
        map.put(nums[i], res + 1);
      } else {
        map.put(nums[i], 1);
      }
    }
    return -1;
  }

  // Wiser Approach

  public int majorityElement2(int[] nums) {
    Arrays.sort(nums);
    return nums[nums.length / 2];
  }
}
