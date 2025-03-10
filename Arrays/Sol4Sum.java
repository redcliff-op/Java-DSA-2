import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol4Sum {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    List<List<Integer>> res = new ArrayList<>();
    int len = nums.length;
    Arrays.sort(nums);
    for (int i = 0; i < len - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < len - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        int l = j + 1;
        int r = len - 1;
        while (l < r) {
          long sum = (long) nums[i] + nums[j] + nums[l] + nums[r]; // Use long
          if (sum == target) {
            res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
            while (l < r && nums[l] == nums[l + 1]) {
              l++;
            }
            while (l < r && nums[r] == nums[r - 1]) {
              r--;
            }
            l++;
            r--;
          } else if (sum < target) {
            l++;
          } else {
            r--;
          }
        }
      }
    }
    return res;
  }
}
